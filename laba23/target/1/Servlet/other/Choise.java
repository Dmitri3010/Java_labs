package other;

import java.io.*;

public class Choise {
    public String list[];
    protected class OnlyXXX implements FilenameFilter {
        String xxx = null;
        public OnlyXXX(String xxx) {
            this.xxx = "." + xxx;
        }
        public boolean accept(File d, String name) {
            return name.endsWith(xxx);
        }
    }
    public Choise(String d, String xxx) {
        File dir = new File(d);
        if (dir.exists()) {
            list = dir.list(new OnlyXXX(xxx));
        }
    }


}
