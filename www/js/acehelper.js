//This file is a wrapper for Native ACE functions that are used 

function AceHelper()
{
	this.animObj = new ace.NativeObject(ace.valueOn({ android: "com.rahulverlekar.animations.RVAnimation" }));
	this.particleObj = new ace.NativeObject(ace.valueOn({ android: "com.rahulverlekar.animations.ParticleAnimator" }));
}


AceHelper.prototype.invoke = function(name, payload, callback) {
	// body...
};

function wrapPayload (payload, callback) {
	return {"data" : payload, "callback" : callback};
}

AceHelper.prototype.startShower = function(payload, callback) {
	var jsonObj = {"x":bodyRect.left, "y":bodyRect.top, "duration":2000, "max_particle": 200}
    particleObj.invoke("startShower", ace.android.getActivity(), JSON.stringify(jsonObj));
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
	animObj.invoke("MakeListViewWithAnimations", ace.android.getActivity());
}