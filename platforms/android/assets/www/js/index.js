var _nativePage;

function initializeUI() {
    /*ace.load("android://list_layout.xml", function(root) {
        var popup = new ace.Popup();
        popup.setContent(root);
        popup.show();
    });
    document.getElementById('btn-open-popoup').addEventListener("click", function clickedOnBtn () {
        onButtonClick();
    });

    document.getElementById('btn-do-native').addEventListener("click", function clickedOnBtn () {
        loadNativeUI();
    });

    document.getElementById('btn-animate').addEventListener("click", function clickedOnBtn () {
        animateUI();
    });   

    document.getElementById('btn-send-json').addEventListener("click", function clickedOnBtn () {
        sendJsonData();
    });*/
    var popup;
    ace.load("android://yoyo_activity.xml", function(root) {
        popup = new ace.Popup();
        popup.setContent(root);
        popup.show();
        document.getElementById('btn-animate-list').addEventListener("click", function clickedOnBtn() {
            $("input").hide();
            $("#btn-add-listview").show();
            animateList();
        });
        document.getElementById('btn-change-margin').addEventListener("click", function clickedOnBtn() {
            $("input").hide();
            $("#btn-animate-list").show();
            changeButtonMargin();
        });
        document.getElementById('btn-add-listview').addEventListener("click", function clickedOnBtn() {
            $("input").hide();
            $("#btn-animate-list").show();
            addListView();
        });

        document.getElementById('btn-add-newdata').addEventListener("click", function clickedOnBtn() {
            $("input").hide();
            $("#btn-animate-list").show();
            addNewItem();
        });
    });

}

function animateUI() {
    var obj = new ace.NativeObject(ace.valueOn({ android: "com.rahulverlekar.animations.RVAnimation" }));
    obj.invoke("animateUI", ace.android.getActivity());
}

function loadNativeUI() {
    ace.load("android://button.xml", function(root) {
        var popup = new ace.Popup();
        popup.setContent(root);
        popup.show();
        var obj = new ace.NativeObject(ace.valueOn({ android: "com.rahulverlekar.animations.RVAnimation" }));
        obj.invoke("changeNativeBackground", root);
    });
}

var animObj;

function animateList() {
    // ace.load("android://yoyo_activity.xml", function(root) {
    //     if (animPopup == undefined) {
    //         var animPopup = new ace.Popup();
    //         animPopup.setContent(root);
    //         animPopup.show();
    //     };
    // if (animObj == undefined) {
    animObj = new ace.NativeObject(ace.valueOn({ android: "com.rahulverlekar.animations.RVAnimation" }));
    animObj.invoke("MakeListViewWithAnimations", ace.android.getActivity());
    // };
    // });
}

function changeButtonMargin() {
    ace.load("android://yoyo_activity.xml", function(root) {
        var bodyRect = document.getElementById('btn-animate-list').getBoundingClientRect();
        var popup = new ace.Popup();
        popup.setContent(root);
        popup.show();
        var obj = new ace.NativeObject(ace.valueOn({ android: "com.rahulverlekar.animations.RVAnimation" }));
        obj.invoke("changeButtonMargin", ace.android.getActivity(), bodyRect.top, bodyRect.left);
    });
}

function onButtonClick() {
    var obj = new ace.NativeObject(ace.valueOn({ android: "com.rahulverlekar.animations.RVAnimation" }));
    obj.invoke("animateView", ace.android.getActivity());
}

function sendJsonData() {
    var jsonObj = { "name": "rahul" };
    var obj = new ace.NativeObject(ace.valueOn({ android: "com.rahulverlekar.animations.RVAnimation" }));
    obj.invoke("getJsonData", ace.android.getActivity(), (jsonObj));

}

var listObj;
var listViewPopup;

function addListView() {
    var jsonObj = ["name", "rahul", "abd", "dsadsa", "dsasadd", "qwewq", "last item"];
    // if (listObj == undefined) {
    listObj = new ace.NativeObject("com.rahulverlekar.animations.BidchatMessageList", ace.android.getActivity(), JSON.stringify(jsonObj));
    // };
}

function hideAllPopups() {
    if (listViewPopup != undefined) {
        listViewPopup.hide();
    };
    if (animPopup != undefined) {
        animPopup.hide();
    };
    if (animObj != undefined) {
        animObj = null;
    };
    if (listObj != undefined) {
        listObj = null;
    };
}

function addNewItem() {
    if (listObj != undefined) {
        listObj.invoke("addNewString", makeid());
    };
}

function makeid() {
    var text = "";
    var possible = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    for (var i = 0; i < 5; i++)
        text += possible.charAt(Math.floor(Math.random() * possible.length));

    return text;
}

function onNav(e) {
    var bodyRect = document.getElementById('btn-animate-list').getBoundingClientRect();
    // elemRect = element.getBoundingClientRect(),
    // offset   = elemRect.top - bodyRect.top;
    alert('Element Top:' + bodyRect.top + 'Left:' + bodyRect.left + "Right:" + bodyRect.right);
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
        // document.addEventListener('touchstart', onNav, false);

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
