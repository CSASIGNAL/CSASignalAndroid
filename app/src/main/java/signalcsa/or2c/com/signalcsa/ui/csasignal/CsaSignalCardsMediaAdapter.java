package signalcsa.or2c.com.signalcsa.ui.csasignal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

import signalcsa.or2c.com.signalcsa.CsaSignal;
import signalcsa.or2c.com.signalcsa.R;
import signalcsa.or2c.com.signalcsa.WebViewActivity;
import signalcsa.or2c.com.signalcsa.ui.csasignal.core.ImageUtil;
//import signalcsa.or2c.com.signalcsa.ui.csasignal.core.ImageUtil;


public class CsaSignalCardsMediaAdapter extends ArrayAdapter<List<Object>> implements OnClickListener {
    private LayoutInflater mInflater;

    private List<List<Object>> data;

    private String dataStr;

    final Gson gson = new GsonBuilder().serializeNulls().create();

    private static class ViewHolder {
        public TextView artistName;
        public TextView country;
        public TextView favorite;
        public ImageView image;
        public TextView like;
        public TextView share;
        public TextView text;
        public TextView year;

        private ViewHolder() {
        }
    }

    public CsaSignalCardsMediaAdapter(Context context, List<List<Object>> list,String _dataStr) {
        super(context, 0, list);
        data = list;
        dataStr= _dataStr;
        this.mInflater = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public CsaSignalCardsMediaAdapter(Context context, List<List<Object>> list) {
        super(context, 0, list);
        data = list;
        this.mInflater = (LayoutInflater) context.getSystemService("layout_inflater");
    }

   /* public long getItemId(int i) {
        return ((DummyModel) getItem(i)).getId();
    }*/

    public View getView(final int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            view = this.mInflater.inflate(R.layout.list_item_google_cards_media, viewGroup, false);
            viewHolder = new ViewHolder();
            //viewHolder.image = (ImageView) view.findViewById(R.id.list_item_google_cards_media_image);
            viewHolder.artistName = (TextView) view.findViewById(R.id.list_item_google_cards_media_artist_name);
            viewHolder.year = (TextView) view.findViewById(R.id.list_item_google_cards_media_year);
            viewHolder.text = (TextView) view.findViewById(R.id.list_item_google_cards_media_text);
            //viewHolder.country = (TextView) view.findViewById(R.id.list_item_google_cards_media_country);
            //viewHolder.like = (TextView) view.findViewById(R.id.list_item_google_cards_media_like);
            //viewHolder.favorite = (TextView) view.findViewById(R.id.list_item_google_cards_media_favorite);
            viewHolder.share = (TextView) view.findViewById(R.id.list_item_google_cards_media_share);
//            viewHolder.like.setOnClickListener(this);
  //          viewHolder.favorite.setOnClickListener(this);
            viewHolder.share.setOnClickListener(this);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }



        viewHolder.artistName.setText((String)((ArrayList<Object>)getItem(i)).get(2) +" - "+(String)((ArrayList<Object>)getItem(i)).get(3));
        viewHolder.year.setText((String)((ArrayList<Object>)getItem(i)).get(4) +" - "+(String)((ArrayList<Object>)getItem(i)).get(5));
        viewHolder.text.setText((String)((ArrayList<Object>)getItem(i)).get(7));

/*        viewHolder.like.setTag((String)((ArrayList<Object>)getItem(i)).get(0));
        viewHolder.favorite.setTag((String)((ArrayList<Object>)getItem(i)).get(0));*/
        viewHolder.share.setTag((String)((ArrayList<Object>)getItem(i)).get(0));


        //ImageUtil.displayImage(viewHolder.image, ((DummyModel) getItem(i)).getImageURL(), null);
        view.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ;
                Intent intent = new Intent(getContext(), WebViewActivity.class);
                intent.putExtra("viewid",i);
                intent.putExtra("data",dataStr);
                getContext().startActivity(intent);
            }
        });
        return view;
    }

    public void onClick(View view) {
        String id = ((String) view.getTag());
        switch (view.getId()) {
           /*case R.id.list_item_google_cards_media_favorite ://2131165620
                Context context = getContext();
                StringBuilder sb = new StringBuilder();
                sb.append("Favorite ");
                sb.append(id);
                Toast.makeText(context, sb.toString(), 0).show();
                return;
            case R.id.list_item_google_cards_media_like: //2131165622
                Context context2 = getContext();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Like ");
                sb2.append(id);
                Toast.makeText(context2, sb2.toString(), 0).show();
                return;*/
            case R.id.list_item_google_cards_media_share /*2131165623*/:
                Context context3 = getContext();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Share ");
                sb3.append(id);
                shareCsaSignale(context3,id);
                //Toast.makeText(context3, sb3.toString(), 0).show();
                return;
            default:
                return;
        }
    }


    private void shareCsaSignale(Context context, String id) {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        String url = "https://play.google.com/store/search?q=signalcsa.or2c.com.signalcsa&c=apps";
        sendIntent.putExtra(Intent.EXTRA_TEXT, "Merci de participer au signalement CSA via cette application : "+url);
        sendIntent.putExtra(Intent.EXTRA_TITLE, "Partager le signalement");
        sendIntent.putExtra(Intent.EXTRA_REFERRER, id);
        sendIntent.setType("text/plain");
        //context.startActivity(sendIntent);
        context.startActivity(Intent.createChooser(sendIntent, "Share images to.."));
    }
}
