package crc64bb0d992854e4ca09;


public class AndroidHorizontalListViewRenderer_EmptyViewHolder
	extends androidx.recyclerview.widget.RecyclerView.ViewHolder
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Sharpnado.Presentation.Forms.Droid.Renderers.HorizontalList.AndroidHorizontalListViewRenderer+EmptyViewHolder, Sharpnado.Presentation.Forms.Droid", AndroidHorizontalListViewRenderer_EmptyViewHolder.class, __md_methods);
	}


	public AndroidHorizontalListViewRenderer_EmptyViewHolder (android.view.View p0)
	{
		super (p0);
		if (getClass () == AndroidHorizontalListViewRenderer_EmptyViewHolder.class)
			mono.android.TypeManager.Activate ("Sharpnado.Presentation.Forms.Droid.Renderers.HorizontalList.AndroidHorizontalListViewRenderer+EmptyViewHolder, Sharpnado.Presentation.Forms.Droid", "Android.Views.View, Mono.Android", this, new java.lang.Object[] { p0 });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
