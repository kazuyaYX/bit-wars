/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitwars;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

/**
 *
 * @author lyx
 */
public class BitWars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        if (null == ToolProvider.getSystemJavaCompiler()) {
            try {
                copyTools();
            } catch (IOException ex) {
                if(ex.toString().contains("拒绝访问")){
                    try {
                        File outfile = new File(System.getProperty("user.dir")+"\\error.txt");
                        FileOutputStream fout = new FileOutputStream(outfile);
                        fout.write("系统权限太高，自动复制出错！\n请手动复制程序根目录下lib包下的tools.jar到jre文件lib包下！".getBytes());
                        fout.close();
                    } catch (FileNotFoundException ex1) {
                        Logger.getLogger(BitWars.class.getName()).log(Level.SEVERE, null, ex1);
                    } catch (IOException ex1) {
                        Logger.getLogger(BitWars.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                }
            }
        }

        MainJFrame mainFrame = new MainJFrame();
        mainFrame.setVisible(true);

    }

    public static void copyTools() throws IOException {
        String inpath = System.getProperty("user.dir") + "\\lib\\tools.jar";
        String outpath = System.getProperty("java.home") + "\\lib\\tools.jar";
        File infile = new File(inpath);
        File outfile = new File(outpath);
        if (!outfile.exists()) {
            outfile.createNewFile();
        }
        FileInputStream fin = null;
        FileOutputStream fout = null;
        FileChannel in = null;
        FileChannel out = null;

        fin = new FileInputStream(infile);
        fout = new FileOutputStream(outfile);
        in = fin.getChannel();
        out = fout.getChannel();
        in.transferTo(0, in.size(), out);
        fin.close();
        in.close();
        fout.close();
        out.close();
    }

}
