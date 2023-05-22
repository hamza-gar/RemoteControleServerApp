package threadServices;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.TargetDataLine;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SoundThread implements Runnable{
    private String address;

    public SoundThread(String ad){
        this.address = ad;
    }

    @Override
    public void run() {
        TargetDataLine line;
        DatagramPacket dgp;

        AudioFormat.Encoding encoding = AudioFormat.Encoding.PCM_SIGNED;
        float rate = 48000f;
        int channel = 1;
        int sampleSize = 16;
        boolean bigEndian = false;

        int BUF_SIZE = 5 * 5 * sampleSize * 2;

        AudioFormat format = new AudioFormat(encoding, rate, sampleSize, channel, (sampleSize / 8) * channel, rate, bigEndian);

        DataLine.Info info = new DataLine.Info(TargetDataLine.class,format);

        try {
            line = (TargetDataLine) AudioSystem.getLine(info);
            line.open(format);
            line.start();
            byte[] data = new byte[BUF_SIZE];

            InetAddress address = InetAddress.getByName(this.address);
            DatagramSocket socket = new DatagramSocket();
            while(true){
                line.read(data,0,BUF_SIZE);
                dgp = new DatagramPacket(data, BUF_SIZE,address,50005);
                socket.send(dgp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
