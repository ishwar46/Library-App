package crc64bb0d992854e4ca09;


public class SlowRecyclerView
	extends androidx.recyclerview.widget.RecyclerView
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_fling:(II)Z:GetFling_IIHandler\n" +
			"";
		mono.android.Runtime.register ("Sharpnado.Presentation.Forms.Droid.Renderers.HorizontalList.SlowRecyclerView, Sharpnado.Presentation.Forms.Droid", SlowRecyclerView.class, __md_methods);
	}


	public SlowRecyclerView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == SlowRecyclerView.class)
			mono.android.TypeManager.Activate ("Sharpnado.Presentation.Forms.Droid.Renderers.HorizontalList.SlowRecyclerView, Sharpnado.Presentation.Forms.Droid", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public SlowRecyclerView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == SlowRecyclerView.class)
			mono.android.TypeManager.Activate ("Sharpnado.Presentation.Forms.Droid.Renderers.HorizontalList.SlowRecyclerView, Sharpnado.Presentation.Forms.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public SlowRecyclerView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == SlowRecyclerView.class)
			mono.android.TypeManager.Activate ("Sharpnado.Presentation.Forms.Droid.Renderers.HorizontalList.SlowRecyclerView, Sharpnado.Presentation.Forms.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public boolean fling (int p0, int p1)
	{
		return n_fling (p0, p1);
	}

	private native boolean n_fling (int p0, int p1);

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
