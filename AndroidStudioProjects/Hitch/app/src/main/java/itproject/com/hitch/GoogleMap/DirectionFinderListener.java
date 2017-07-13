package itproject.com.hitch.GoogleMap;

import java.util.List;

/**
 * Created by HP on 7/9/2017.
 */

public interface DirectionFinderListener {
    void onDirectionFinderStart();
    void onDirectionFinderSuccess(List<Route> routes);
}
