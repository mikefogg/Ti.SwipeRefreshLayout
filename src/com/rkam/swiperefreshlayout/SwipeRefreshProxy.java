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
		this.swipeRefresh = new SwipeRefresh(this);
	}

	@Override
	public TiUIView createView(Activity activity) {
		return this.swipeRefresh;
	}
	
	@Kroll.method
	public void setRefreshing(boolean refreshing) {
		this.swipeRefresh.setRefreshing(refreshing);
		return;
	}
	
	@Kroll.method
	public void add(TiViewProxy view) {
		this.swipeRefresh.add(view);
		return;
	}
	
	@Kroll.method @Kroll.getProperty
	public boolean isRefreshing() {
		return this.swipeRefresh.isRefreshing();
	}
}
