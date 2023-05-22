package GUI;

import static threadServices.QrService.generateQRcode;

import com.google.zxing.WriterException;
import threadServices.*;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.Socket;

public class DesktopRemoteApp {

    public static BufferedImage getQr() throws IOException, WriterException {
        // step 1: create QR code and print it to screen
        String local_address = Inet4Address.getLocalHost().toString();
        String[] address = local_address.split("/");
        return generateQRcode(address[1],400,400);
    }
}
