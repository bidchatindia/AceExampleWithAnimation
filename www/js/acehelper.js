AceHelper = function() 
	{ 
			this.animObj = new ace.NativeObject(ace.valueOn({ android: "com.rahulverlekar.animations.RVAnimation" }));
			this.particleObj = new ace.NativeObject(ace.valueOn({ android: "com.rahulverlekar.animations.ParticleAnimator" }));
	};


AceHelper.prototype.initAnimationView = function() { 
	var animObj1 = this.animObj;
	ace.load("android://yoyo_activity.xml", function(root) {
        popup = new ace.Popup();
        popup.setContent(root);
        popup.show();
		animObj1.invoke("MakeListViewWithAnimations", ace.android.getActivity()); 
	});
};

AceHelper.prototype.closeAnimationView = function() { this.animationObject.invoke("closeAnimationView") };

AceHelper.prototype.showShareMenu = function() { 
	var payload = ["one", "two", "three", "four", "five", "six", "seven"];
	var finalPayload = wrapPayload(payload, "alert");
    listObj = new ace.NativeObject("com.rahulverlekar.animations.BidchatMessageList", ace.android.getActivity(), JSON.stringify(finalPayload));
 };

AceHelper.prototype.showShareMenuWithResult = function(d, c) { 
	var payload = ["one", "two", "three", "four", "five", "six", "seven"];
	var finalPayload = wrapPayload(payload, c);
    listObj = new ace.NativeObject("com.rahulverlekar.animations.BidchatMessageList", ace.android.getActivity(), JSON.stringify(finalPayload));
};

AceHelper.prototype.initAnimations = function() { this.animationObject.invoke("initAnimations") };

AceHelper.prototype.initActivityFeeds = function() { 
	var finalPayload = wrapPayload(payload, callback);
    listObj = new ace.NativeObject("com.rahulverlekar.animations.BidchatMessageList", ace.android.getActivity(), JSON.stringify(finalPayload));
 };

AceHelper.prototype.refreshActivityFeed = function(b) { this.animationObject.invoke("refreshActivityFeed", JSON.stringify(b)) };

AceHelper.prototype.showerLikes = function(b) { 
	var jsonObj = {"x":bodyRect.left, "y":bodyRect.top, "duration":2000, "max_particle": 200};
    this.particleObj.invoke("startShower", ace.android.getActivity(), JSON.stringify(wrapPayload(payload, callback))); 
};

AceHelper.prototype.stopLikes = function() { this.animationObject.invoke("stopLikes") };

AceHelper.prototype.sampleMethodsWithParamAndCallback = function(d, c) { this.animationObject.invoke("sampleMethod", JSON.stringify(d), c) };
