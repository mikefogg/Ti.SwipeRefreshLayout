package com.rkam.swiperefreshlayout;

import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.titanium.proxy.TiViewProxy;
import org.appcelerator.titanium.view.TiUIView;

import android.app.Activity;

@Kroll.proxy(creatableInModule=SwiperefreshlayoutModule.class)
public class SwipeRefreshProxy extends TiViewProxy {

	private SwipeRefresh swipeRefresh;
	
	public SwipeRefreshProxy() {
		super();
	}

	@Override
	public TiUIView createView(Activity activity) {
		swipeRefresh = new SwipeRefresh(this);
		return this.swipeRefresh;
	}
	
	@Kroll.method
	public void setRefreshing(boolean refreshing) {
		if (this.swipeRefresh != null){
			this.swipeRefresh.setRefreshing(refreshing);
		}		
	}
	
	@Kroll.method @Kroll.getProperty
	public boolean isRefreshing() {
		if (this.swipeRefresh != null){
			return this.swipeRefresh.isRefreshing();
		}
		return false;
	}
}
