package crc64bb0d992854e4ca09;


public class AndroidHorizontalListViewRenderer_DragAnDropItemTouchHelperCallback
	extends androidx.recyclerview.widget.ItemTouchHelper.Callback
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_isLongPressDragEnabled:()Z:GetIsLongPressDragEnabledHandler\n" +
			"n_getMovementFlags:(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)I:GetGetMovementFlags_Landroidx_recyclerview_widget_RecyclerView_Landroidx_recyclerview_widget_RecyclerView_ViewHolder_Handler\n" +
			"n_onSelectedChanged:(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V:GetOnSelectedChanged_Landroidx_recyclerview_widget_RecyclerView_ViewHolder_IHandler\n" +
			"n_onMove:(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z:GetOnMove_Landroidx_recyclerview_widget_RecyclerView_Landroidx_recyclerview_widget_RecyclerView_ViewHolder_Landroidx_recyclerview_widget_RecyclerView_ViewHolder_Handler\n" +
			"n_onMoved:(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILandroidx/recyclerview/widget/RecyclerView$ViewHolder;III)V:GetOnMoved_Landroidx_recyclerview_widget_RecyclerView_Landroidx_recyclerview_widget_RecyclerView_ViewHolder_ILandroidx_recyclerview_widget_RecyclerView_ViewHolder_IIIHandler\n" +
			"n_interpolateOutOfBoundsScroll:(Landroidx/recyclerview/widget/RecyclerView;IIIJ)I:GetInterpolateOutOfBoundsScroll_Landroidx_recyclerview_widget_RecyclerView_IIIJHandler\n" +
			"n_getMoveThreshold:(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)F:GetGetMoveThreshold_Landroidx_recyclerview_widget_RecyclerView_ViewHolder_Handler\n" +
			"n_clearView:(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V:GetClearView_Landroidx_recyclerview_widget_RecyclerView_Landroidx_recyclerview_widget_RecyclerView_ViewHolder_Handler\n" +
			"n_onSwiped:(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V:GetOnSwiped_Landroidx_recyclerview_widget_RecyclerView_ViewHolder_IHandler\n" +
			"";
		mono.android.Runtime.register ("Sharpnado.Presentation.Forms.Droid.Renderers.HorizontalList.AndroidHorizontalListViewRenderer+DragAnDropItemTouchHelperCallback, Sharpnado.Presentation.Forms.Droid", AndroidHorizontalListViewRenderer_DragAnDropItemTouchHelperCallback.class, __md_methods);
	}


	public AndroidHorizontalListViewRenderer_DragAnDropItemTouchHelperCallback ()
	{
		super ();
		if (getClass () == AndroidHorizontalListViewRenderer_DragAnDropItemTouchHelperCallback.class)
			mono.android.TypeManager.Activate ("Sharpnado.Presentation.Forms.Droid.Renderers.HorizontalList.AndroidHorizontalListViewRenderer+DragAnDropItemTouchHelperCallback, Sharpnado.Presentation.Forms.Droid", "", this, new java.lang.Object[] {  });
	}


	public boolean isLongPressDragEnabled ()
	{
		return n_isLongPressDragEnabled ();
	}

	private native boolean n_isLongPressDragEnabled ();


	public int getMovementFlags (androidx.recyclerview.widget.RecyclerView p0, androidx.recyclerview.widget.RecyclerView.ViewHolder p1)
	{
		return n_getMovementFlags (p0, p1);
	}

	private native int n_getMovementFlags (androidx.recyclerview.widget.RecyclerView p0, androidx.recyclerview.widget.RecyclerView.ViewHolder p1);


	public void onSelectedChanged (androidx.recyclerview.widget.RecyclerView.ViewHolder p0, int p1)
	{
		n_onSelectedChanged (p0, p1);
	}

	private native void n_onSelectedChanged (androidx.recyclerview.widget.RecyclerView.ViewHolder p0, int p1);


	public boolean onMove (androidx.recyclerview.widget.RecyclerView p0, androidx.recyclerview.widget.RecyclerView.ViewHolder p1, androidx.recyclerview.widget.RecyclerView.ViewHolder p2)
	{
		return n_onMove (p0, p1, p2);
	}

	private native boolean n_onMove (androidx.recyclerview.widget.RecyclerView p0, androidx.recyclerview.widget.RecyclerView.ViewHolder p1, androidx.recyclerview.widget.RecyclerView.ViewHolder p2);


	public void onMoved (androidx.recyclerview.widget.RecyclerView p0, androidx.recyclerview.widget.RecyclerView.ViewHolder p1, int p2, androidx.recyclerview.widget.RecyclerView.ViewHolder p3, int p4, int p5, int p6)
	{
		n_onMoved (p0, p1, p2, p3, p4, p5, p6);
	}

	private native void n_onMoved (androidx.recyclerview.widget.RecyclerView p0, androidx.recyclerview.widget.RecyclerView.ViewHolder p1, int p2, androidx.recyclerview.widget.RecyclerView.ViewHolder p3, int p4, int p5, int p6);


	public int interpolateOutOfBoundsScroll (androidx.recyclerview.widget.RecyclerView p0, int p1, int p2, int p3, long p4)
	{
		return n_interpolateOutOfBoundsScroll (p0, p1, p2, p3, p4);
	}

	private native int n_interpolateOutOfBoundsScroll (androidx.recyclerview.widget.RecyclerView p0, int p1, int p2, int p3, long p4);


	public float getMoveThreshold (androidx.recyclerview.widget.RecyclerView.ViewHolder p0)
	{
		return n_getMoveThreshold (p0);
	}

	private native float n_getMoveThreshold (androidx.recyclerview.widget.RecyclerView.ViewHolder p0);


	public void clearView (androidx.recyclerview.widget.RecyclerView p0, androidx.recyclerview.widget.RecyclerView.ViewHolder p1)
	{
		n_clearView (p0, p1);
	}

	private native void n_clearView (androidx.recyclerview.widget.RecyclerView p0, androidx.recyclerview.widget.RecyclerView.ViewHolder p1);


	public void onSwiped (androidx.recyclerview.widget.RecyclerView.ViewHolder p0, int p1)
	{
		n_onSwiped (p0, p1);
	}

	private native void n_onSwiped (androidx.recyclerview.widget.RecyclerView.ViewHolder p0, int p1);

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
