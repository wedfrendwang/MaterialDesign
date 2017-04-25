package wedfrend.wang.materialdesign;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by welive on 2017/4/24.
 */

public class myAdapter extends FragmentPagerAdapter {
    private List<String> listString;

    public myAdapter(FragmentManager fm, List<String> listString) {
        super(fm);
        this.listString = listString;
    }

    @Override
    public Fragment getItem(int position) {
        return  fragment.newInstance(listString.get(position));
    }

    @Override
    public int getCount() {
        return listString.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return listString.get(position);
    }
}
