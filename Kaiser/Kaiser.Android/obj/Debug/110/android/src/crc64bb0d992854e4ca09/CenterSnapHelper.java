package crc64bb0d992854e4ca09;


public class CenterSnapHelper
	extends androidx.recyclerview.widget.LinearSnapHelper
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_findTargetSnapPosition:(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;II)I:GetFindTargetSnapPosition_Landroidx_recyclerview_widget_RecyclerView_LayoutManager_IIHandler\n" +
			"n_findSnapView:(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)Landroid/view/View;:GetFindSnapView_Landroidx_recyclerview_widget_RecyclerView_LayoutManager_Handler\n" +
			"";
		mono.android.Runtime.register ("Sharpnado.Presentation.Forms.Droid.Renderers.HorizontalList.CenterSnapHelper, Sharpnado.Presentation.Forms.Droid", CenterSnapHelper.class, __md_methods);
	}


	public CenterSnapHelper ()
	{
		super ();
		if (getClass () == CenterSnapHelper.class)
			mono.android.TypeManager.Activate ("Sharpnado.Presentation.Forms.Droid.Renderers.HorizontalList.CenterSnapHelper, Sharpnado.Presentation.Forms.Droid", "", this, new java.lang.Object[] {  });
	}

	public CenterSnapHelper (crc64bb0d992854e4ca09.AndroidHorizontalListViewRenderer p0)
	{
		super ();
		if (getClass () == CenterSnapHelper.class)
			mono.android.TypeManager.Activate ("Sharpnado.Presentation.Forms.Droid.Renderers.HorizontalList.CenterSnapHelper, Sharpnado.Presentation.Forms.Droid", "Sharpnado.Presentation.Forms.Droid.Renderers.HorizontalList.AndroidHorizontalListViewRenderer, Sharpnado.Presentation.Forms.Droid", this, new java.lang.Object[] { p0 });
	}


	public int findTargetSnapPosition (androidx.recyclerview.widget.RecyclerView.LayoutManager p0, int p1, int p2)
	{
		return n_findTargetSnapPosition (p0, p1, p2);
	}

	private native int n_findTargetSnapPosition (androidx.recyclerview.widget.RecyclerView.LayoutManager p0, int p1, int p2);


	public android.view.View findSnapView (androidx.recyclerview.widget.RecyclerView.LayoutManager p0)
	{
		return n_findSnapView (p0);
	}

	private native android.view.View n_findSnapView (androidx.recyclerview.widget.RecyclerView.LayoutManager p0);

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
