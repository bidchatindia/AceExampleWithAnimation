var _nativePage;
var acehelper;

function initializeUI() {
    var popup;
    ace.load("android://yoyo_activity.xml", function(root) {
        popup = new ace.Popup();
        popup.setContent(root);
        popup.show();
        acehelper = new AceHelper()
        document.getElementById('btn-animate-list').addEventListener("click", function clickedOnBtn() {
            $("input").hide();
            $("#btn-add-listview, #btn-change-margin").show();
            showBroadcaseList();
        });
        document.getElementById('btn-add-listview').addEventListener("click", function clickedOnBtn() {
            $("input").hide();
            $("#btn-animate-list, #btn-change-margin").show();
            addListView();
            setInterval(
                function() {
                    addNewItem();
                }, 3000);
        });

        document.getElementById('btn-add-newdata').addEventListener("click", function clickedOnBtn() {
            $("input").hide();
            $("#btn-animate-list, #btn-change-margin").show();
            addNewItem();
        });

        document.getElementById('btn-change-margin').addEventListener("click", function clickedOnBtn() {
            $("input").hide();
            $("#btn-change-margin, #btn-change-margin").show();
            sendParticleShower();
        });

        document.getElementById('btn-open-camera').addEventListener("click", function clickedOnBtn() {
            cordova.plugins.PhotoPicker.takePhoto(function success(argument) {
                alert(argument);
            }, function error(argument) {
                alert(argument);
            });
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
    acehelper.initAnimationView();
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

function changeViewMargin() {
    var obj = new ace.NativeObject(ace.valueOn({ android: "com.rahulverlekar.animations.RVAnimation" }));
    obj.invoke("changeViewMargin", ace.android.getActivity(), 150, 25, "lv_anim_table");
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

function sendParticleShower() {
    var bodyRect = document.getElementById('placed_text').getBoundingClientRect();
    var jsonObj = { "x": bodyRect.top, "y": bodyRect.left, "duration": 2000, "max_particle": 200 }
    acehelper.startShower(jsonObj);

}

function showBroadcaseList() {
    acehelper.initBroadcastList();
}

var listObj;
var listViewPopup;

function addListView() {
    var jsonObj = ["name", "rahul", "abd", "dsadsa", "dsasadd", "qwewq", "last item"];
    acehelper.initListView(jsonObj, "showAlert");
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

function showAlert(argument) {
    alert(argument);
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
