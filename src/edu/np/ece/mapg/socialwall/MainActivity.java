package edu.np.ece.mapg.socialwall;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

	/*
	 * String[] actions = new String[] { "Facebook", "Instagram", "Twitter" };
	 */

	// private WebView webViewControl;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// | String url = "http://google.com.sg";
		WebView view = (WebView) this.findViewById(R.id.webViewControl);

		// view.getSettings().setJavaScriptEnabled(true);
		// | view.setWebViewClient(new Callback());
		// | view.loadUrl(url);

		// webViewControl.getSettings().setJavaScriptEnabled(true);
		// webViewControl.loadUrl("www.google.com.sg");

	}

	private class Callback extends WebViewClient { // HERE IS THE MAIN CHANGE.

		@Override
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
			return (false);
		}

	}

	/*
	 * ArrayAdapter<String> adapter = new ArrayAdapter<String>(getBaseContext(),
	 * android.R.layout.simple_spinner_dropdown_item, actions);
	 * 
	 * getActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);
	 * 
	 * ActionBar.OnNavigationListener navigationListener = new
	 * OnNavigationListener() {
	 * 
	 * @Override public boolean onNavigationItemSelected(int itemPosition, long
	 * itemId) { Toast.makeText(getBaseContext(), "You selected : " +
	 * actions[itemPosition] , Toast.LENGTH_SHORT).show(); return false; } };
	 * 
	 * getActionBar().setListNavigationCallbacks(adapter, navigationListener);
	 */

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		super.onOptionsItemSelected(item);
		switch (item.getItemId()) {
		case R.id.facebook:
			facebookMenuItem();
			break;
		case R.id.instagram:
			instagramMenuItem();
			break;
		case R.id.twitter:
			twitterMenuItem();
			break;
		case R.id.tumblr:
			tumblrMenuItem();
			break;
		}

		return true;
	}

	private void facebookMenuItem() {

		// final Context context = this;

		/*Intent i = null;
		i = new Intent(Intent.ACTION_VIEW,
				Uri.parse("https://www.facebook.com/"));
		// Intent i = new Intent (context, WebViewControlActivity.class);
		startActivity(i); */
		WebView view = (WebView) this.findViewById(R.id.webViewControl);
		
		String url = "https://www.facebook.com/";
		view.setWebViewClient(new Callback());
	    view.loadUrl(url);
	}

	private void instagramMenuItem() {
		//Intent i = null;
		//i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/"));
		//startActivity(i);
		WebView view = (WebView) this.findViewById(R.id.webViewControl);
		
		String url = "https://www.instagram.com/";
		view.setWebViewClient(new Callback());
	    view.loadUrl(url);
	}

	private void twitterMenuItem() {
		/*Intent i = null;
		i = new Intent(Intent.ACTION_VIEW,
				Uri.parse("https://www.twitter.com/"));
		startActivity(i);*/
WebView view = (WebView) this.findViewById(R.id.webViewControl);
		
		String url = "https://www.twitter.com/";
		view.setWebViewClient(new Callback());
	    view.loadUrl(url);
		
	}

	private void tumblrMenuItem() {
		/*Intent i = null;
		i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tumblr.com/"));
		startActivity(i);*/
        WebView view = (WebView) this.findViewById(R.id.webViewControl);
		
		String url = "https://www.tumblr.com/";
		view.setWebViewClient(new Callback());
	    view.loadUrl(url);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		MenuInflater mif = getMenuInflater();
		mif.inflate(R.menu.main_activity_action, menu);
		return super.onCreateOptionsMenu(menu);
	}

	/*
	 * @Override public boolean onOptionsItemSelected(MenuItem item) { // Handle
	 * action bar item clicks here. The action bar will // automatically handle
	 * clicks on the Home/Up button, so long // as you specify a parent activity
	 * in AndroidManifest.xml. int id = item.getItemId(); if (id ==
	 * R.id.action_settings) { return true; } return
	 * super.onOptionsItemSelected(item); }
	 */
}
