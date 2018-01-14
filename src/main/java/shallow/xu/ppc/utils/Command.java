package shallow.xu.ppc.utils;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author shallow
 */
public class Command {
    public static void exeCmd(String commandStr) {
        Logger logger = LoggerFactory.getLogger(Command.class);

        BufferedReader br = null;
        try {
            logger.info("脚本内容：\n" + commandStr + "\n");
            Process p = Runtime.getRuntime().exec(commandStr);
            br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = null;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb.append(line + "\n");
            }
            logger.info("脚本输出：\n" + sb.toString());
            System.out.println(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        String commandStr = "ping www.github.com";
        Command.exeCmd(commandStr);
    }
}

