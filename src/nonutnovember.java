import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class nonutnovember {
    public static void openUrl(String url) {
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI(url));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        String[] urls = {"www.pornhub.com", "www.xvideos.com", "www.youporn.com"};

        while(true) {
            for(String url : urls) {
                openUrl(url);
            }
        }
    }
}
