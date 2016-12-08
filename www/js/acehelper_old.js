//This file is a wrapper for Native ACE functions that are used 

function AceHelper()
{
	this.animObj = new ace.NativeObject(ace.valueOn({ android: "com.rahulverlekar.animations.RVAnimation" }));
	this.particleObj = new ace.NativeObject(ace.valueOn({ android: "com.rahulverlekar.animations.ParticleAnimator" }));
	this.broadcastList = new ace.NativeObject(ace.valueOn({ android: "com.rahulverlekar.nativelist.AceBroadcast" }));
}


AceHelper.prototype.invoke = function(name, payload, callback) {
	// body...
};

function wrapPayload (payload, callback) {
	return {"data" : payload, "callback" : callback};
}

AceHelper.prototype.startShower = function(payload, callback) {
	var jsonObj = {"x":bodyRect.left, "y":bodyRect.top, "duration":2000, "max_particle": 200};
    this.particleObj.invoke("startShower", ace.android.getActivity(), JSON.stringify(wrapPayload(payload, callback)));
};

AceHelper.prototype.initListView = function(payload, callback) {
	var finalPayload = wrapPayload(payload, callback);
    listObj = new ace.NativeObject("com.rahulverlekar.animations.BidchatMessageList", ace.android.getActivity(), JSON.stringify(finalPayload));
};

AceHelper.prototype.addItemListView = function(payload) {
	/*var finalPayload = wrapPayload(payload);
    listObj = new ace.NativeObject("com.rahulverlekar.animations.BidchatMessageList", ace.android.getActivity(), JSON.stringify(finalPayload));*/
};

AceHelper.prototype.initAnimationView = function(payload) {
	this.animObj.invoke("MakeListViewWithAnimations", ace.android.getActivity());
}

AceHelper.prototype.initBroadcastList = function(payload) {
	ace.load("android://broadcast_activity.xml", function(root) {
		this.broadcastList = new ace.NativeObject(ace.valueOn({ android: "com.rahulverlekar.nativelist.AceBroadcast" }))
        popup = new ace.Popup();
        popup.setContent(root);
        popup.show();
        data = {"left" : 0, "top" : 350, "right": 0, "bottom" : 0};
        callback = "showAlert";
		this.broadcastList.invoke("initViews", ace.android.getActivity(), JSON.stringify(wrapPayload(data, callback)));
	});
}