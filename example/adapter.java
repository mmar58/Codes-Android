package com.mmar.photowallpaper;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.content.Context;
import android.widget.ImageView;
import java.io.File;
import java.util.List;
import com.mmar.util.dateutil;
import com.mmar.graphics.imagetool;
import android.widget.TextView;

public class FilepickerAd extends ArrayAdapter
{
	Context con;
	List<File> web;
	public FilepickerAd(Context context,
						List<File> web)
	{
		super(context, R.layout.pfilerow, web);
		con = context;
		this.web = web;
	}
	@Override
	public View getView(int position, View v, ViewGroup parent)
	{
		LayoutInflater inflater = LayoutInflater.from(con);
		View view= inflater.inflate(R.layout.pfilerow, null, true);
		ImageView icon=view.findViewById(R.id.pfilerowImage);
		TextView label=view.findViewById(R.id.pfilerowText),
			lastmodified=view.findViewById(R.id.pfilerowlastmodified);
			
		File curfile=web.get(position);
        if(curfile.isFile()){
			icon.setImageDrawable(imagetool.loadDrawable(con,R.drawable.fileicon));
		}else{
			icon.setImageDrawable(imagetool.loadDrawable(con,R.drawable.foldericon));
		}
		label.setText(curfile.getName());
		lastmodified.setText("Last modified:"+dateutil.print(curfile.lastModified()));
		return view;
	}
}