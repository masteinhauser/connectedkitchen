package connectedkitchen.action;

import java.util.Date;
import java.util.Random;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;

/**
 *
 * @author Myles A. K. Steinhauser <myles.steinhauser@gmail.com>
 */
public class HomeAction extends _Action {

    private static final String VIEW = "/home.jsp";
    private Date date;

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    @DefaultHandler
    public Resolution currentDate() {
        date = new Date();
        return new ForwardResolution(VIEW);
    }

    public Resolution randomDate() {
        long max = System.currentTimeMillis();
        long random = new Random().nextLong() % max;

        date = new Date(random);
        return new ForwardResolution(VIEW);
    }
}
