var _nativePage;

function initializeUI() {
    /*ace.load("android://list_layout.xml", function(root) {
        var popup = new ace.Popup();
        popup.setContent(root);
        popup.show();
    });*/
    document.getElementById('btn-open-popoup').addEventListener("click", function clickedOnBtn () {
        onButtonClick();
    });

    document.getElementById('btn-do-native').addEventListener("click", function clickedOnBtn () {
        loadNativeUI();
    });

    document.getElementById('btn-animate').addEventListener("click", function clickedOnBtn () {
        animateUI();
    });   

    document.getElementById('btn-animate-list').addEventListener("click", function clickedOnBtn () {
        animateList();
    });
}

function animateUI () {
    var obj = new ace.NativeObject(ace.valueOn({android: "com.rahulverlekar.animations.RVAnimation"}));
    obj.invoke("animateUI", ace.android.getActivity());
}

function loadNativeUI() {
    ace.load("android://button.xml", function (root) {
            var popup = new ace.Popup();
            popup.setContent(root);
            popup.show();
            var obj = new ace.NativeObject(ace.valueOn({android: "com.rahulverlekar.animations.RVAnimation"}));
            obj.invoke("changeNativeBackground", root);
        });
}

function animateList() {
        ace.load("android://yoyo_activity.xml", function (root) {
            var popup = new ace.Popup();
            popup.setContent(root);
            popup.show();
            var obj = new ace.NativeObject(ace.valueOn({android: "com.rahulverlekar.animations.RVAnimation"}));
            obj.invoke("MakeListViewWithAnimations", ace.android.getActivity());
        });
}

function onButtonClick() {
    var obj = new ace.NativeObject(ace.valueOn({android: "com.rahulverlekar.animations.RVAnimation"}));
    obj.invoke("animateView", ace.android.getActivity());
}

// To debug code on page load in Ripple or on Android devices/emulators: launch your app, set breakpoints,
// and then run "window.location.reload()" in the JavaScript Console.
(function() {
    "use strict";

    document.addEventListener('deviceready', onDeviceReady.bind(this), false);

    function onDeviceReady() {
        // Handle the Cordova pause and resume events
        document.addEventListener('pause', onPause.bind(this), false);
        document.addEventListener('resume', onResume.bind(this), false);

        /*ace.load("android://button.xml", function (root) {
            var popup = new ace.Popup();
            popup.setContent(root);
            popup.show();

            root.addEventListener("setOnClickListener", function () {
                popup.hide();
            });
        });*/
        // Cordova has been loaded. Perform any initialization that requires Cordova here.
        initializeUI();
    };

    function onPause() {
        // This application has been suspended. Save application state here.
    };

    function onResume() {
        // This application has been reactivated. Restore application state here.
    };
})();
