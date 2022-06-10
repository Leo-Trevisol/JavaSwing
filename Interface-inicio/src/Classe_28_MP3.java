
//Bibliotecas .jar necessárias para decodificar o tipo de arquivo de áudio
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Classe_28_MP3 implements ActionListener {

    public static void main(String[] args) {
        new Classe_28_MP3();
    }

    //Declaração das variáveis
    JFrame frame;
    JLabel songNameLabel = new JLabel();
    JButton selectButton = new JButton("Selecionar o Mp3");
    JButton playButton = new JButton("Iniciar");
    JButton pauseButton = new JButton("Pause");
    JButton resumeButton = new JButton("Retomar");
    JButton stopButton = new JButton("Parar");

    JFileChooser fileChooser;
    FileInputStream fileInputStream;
    BufferedInputStream bufferedInputStream;

    File myFile = null;

    String filename;
    String filePath;
    long totalLength;
    long pause;
    Player player;
    Thread playThread;
    Thread resumeThread;

    //Construtor da classe MusicPlayer
    Classe_28_MP3() {
        prepareGUI();
        addActionEvents();

        playThread = new Thread(runnablePlay);
        resumeThread = new Thread(runnableResume);

    }//fim MusicPlayer


    //Método que monta a GUI - INTERFACE GRÁFICA DO USUÁRIO
    public void prepareGUI() {
        frame = new JFrame();
        frame.setTitle("Apliativo de Áudio");
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.black);
        frame.setSize(440, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        selectButton.setBounds(160, 10, 100, 30);
        frame.add(selectButton);

        songNameLabel.setBounds(100, 50, 300, 30);
        frame.add(songNameLabel);

        playButton.setBounds(30, 110, 100, 30);
        frame.add(playButton);

        pauseButton.setBounds(120, 110, 100, 30);
        frame.add(pauseButton);

        resumeButton.setBounds(210, 110, 100, 30);
        frame.add(resumeButton);

        stopButton.setBounds(300, 110, 100, 30);
        frame.add(stopButton);
    }

    //Método que trata as ações dos botões
    public void addActionEvents() {
        //Registrando as ações dos buttons
        selectButton.addActionListener(this);
        playButton.addActionListener(this);
        pauseButton.addActionListener(this);
        resumeButton.addActionListener(this);
        stopButton.addActionListener(this);
    }//fim addActionEvents


    //Método que trata a busca do arquivo de áudio dentro da janela de diálogo
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == selectButton) {
            //código para selecionar nosso arquivo mp3 da janela de diálogo
            fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("C:/"));
//            fileChooser.setCurrentDirectory(new File("C:\\Users\\Secretaria\\Desktop\\PLAYER - MP3 - JAVA"));
            fileChooser.setDialogTitle("Select Mp3");
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fileChooser.setFileFilter(new FileNameExtensionFilter("Mp3 files", "mp3"));

            if (fileChooser.showOpenDialog(selectButton) == JFileChooser.APPROVE_OPTION)
            {
                myFile = fileChooser.getSelectedFile();
                filename = fileChooser.getSelectedFile().getName();
                filePath = fileChooser.getSelectedFile().getPath();
            }
        }

        if (e.getSource() == playButton) {
            //estartando a thread
            //iniciando a execução do áudio
            playThread.start();
            songNameLabel.setText("Execute o play : " + filename);
        }

        if (e.getSource() == pauseButton) {
            //código para o button pause
            if (player != null) {
                try {
                    pause = fileInputStream.available();
                    player.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }

        if (e.getSource() == resumeButton) {
            //estartando o retorno da thread
            resumeThread.start();
        }

        if (e.getSource() == stopButton) {
            //estartando o button de pause
            if (player != null) {
                player.close();
                songNameLabel.setText("");
            }
        }
    }//fim actionPerformed


    Runnable runnablePlay = new Runnable() {
        @Override
        public void run() {
            try {
                //codigo para o play button dar início a execução do áudio
                fileInputStream = new FileInputStream(myFile);
                bufferedInputStream = new BufferedInputStream(fileInputStream);

                player = new Player(bufferedInputStream);
                totalLength = fileInputStream.available();

                //estartando a música
                player.play();
            }
            catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }
            catch (JavaLayerException e)
            {
                e.printStackTrace();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    };

    Runnable runnableResume = new Runnable() {
        @Override
        public void run() {
            try {
                //código para o button de retorno
                fileInputStream = new FileInputStream(myFile);
                bufferedInputStream = new BufferedInputStream(fileInputStream);
                player = new Player(bufferedInputStream);
                fileInputStream.skip(totalLength - pause);

                //estartando a música
                player.play();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (JavaLayerException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    };


}//fim class MusicPlayer implements ActionListener
