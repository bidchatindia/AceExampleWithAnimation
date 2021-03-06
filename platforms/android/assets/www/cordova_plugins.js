cordova.define('cordova/plugin_list', function(require, exports, module) {
module.exports = [
    {
        "file": "plugins/bidchat-photo-picker/www/PhotoPicker.js",
        "id": "bidchat-photo-picker.PhotoPicker",
        "clobbers": [
            "cordova.plugins.PhotoPicker"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/Extensions.js",
        "id": "cordova-plugin-ace.Extensions",
        "merges": [
            "ace.Extensions"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/ToNative.js",
        "id": "cordova-plugin-ace.ToNative",
        "merges": [
            "ace.ToNative"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/ace.js",
        "id": "cordova-plugin-ace.ace",
        "merges": [
            "ace"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/external.js",
        "id": "cordova-plugin-ace.external",
        "merges": [
            "ace.external"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/platformHelpers/android.js",
        "id": "cordova-plugin-ace.android",
        "merges": [
            "ace.android"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/platformHelpers/ios.js",
        "id": "cordova-plugin-ace.ios",
        "merges": [
            "ace.ios"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/primitives/NativeObject.js",
        "id": "cordova-plugin-ace.NativeObject",
        "merges": [
            "ace.NativeObject"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/primitives/KnownNativeObject.js",
        "id": "cordova-plugin-ace.KnownNativeObject",
        "merges": [
            "ace.KnownNativeObject"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/primitives/WrappedNativeObject.js",
        "id": "cordova-plugin-ace.WrappedNativeObject",
        "merges": [
            "ace.WrappedNativeObject"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/primitives/UIElement.js",
        "id": "cordova-plugin-ace.UIElement",
        "merges": [
            "ace.UIElement"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/primitives/Control.js",
        "id": "cordova-plugin-ace.Control",
        "merges": [
            "ace.Control"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/primitives/ContentControl.js",
        "id": "cordova-plugin-ace.ContentControl",
        "merges": [
            "ace.ContentControl"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/primitives/UserControl.js",
        "id": "cordova-plugin-ace.UserControl",
        "merges": [
            "ace.UserControl"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/primitives/ItemsControl.js",
        "id": "cordova-plugin-ace.ItemsControl",
        "merges": [
            "ace.ItemsControl"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/primitives/Selector.js",
        "id": "cordova-plugin-ace.Selector",
        "merges": [
            "ace.Selector"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/primitives/SelectorItem.js",
        "id": "cordova-plugin-ace.SelectorItem",
        "merges": [
            "ace.SelectorItem"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/collections/Dictionary.js",
        "id": "cordova-plugin-ace.Dictionary",
        "merges": [
            "ace.Dictionary"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/collections/ObservableCollection.js",
        "id": "cordova-plugin-ace.ObservableCollection",
        "merges": [
            "ace.ObservableCollection"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/collections/ColumnDefinitionCollection.js",
        "id": "cordova-plugin-ace.ColumnDefinitionCollection",
        "merges": [
            "ace.ColumnDefinitionCollection"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/collections/CommandBarElementCollection.js",
        "id": "cordova-plugin-ace.CommandBarElementCollection",
        "merges": [
            "ace.CommandBarElementCollection"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/collections/InlineCollection.js",
        "id": "cordova-plugin-ace.InlineCollection",
        "merges": [
            "ace.InlineCollection"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/collections/ItemCollection.js",
        "id": "cordova-plugin-ace.ItemCollection",
        "merges": [
            "ace.ItemCollection"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/collections/PathFigureCollection.js",
        "id": "cordova-plugin-ace.PathFigureCollection",
        "merges": [
            "ace.PathFigureCollection"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/collections/PathSegmentCollection.js",
        "id": "cordova-plugin-ace.PathSegmentCollection",
        "merges": [
            "ace.PathSegmentCollection"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/collections/ResourceDictionary.js",
        "id": "cordova-plugin-ace.ResourceDictionary",
        "merges": [
            "ace.ResourceDictionary"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/collections/RowDefinitionCollection.js",
        "id": "cordova-plugin-ace.RowDefinitionCollection",
        "merges": [
            "ace.RowDefinitionCollection"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/collections/SetterBaseCollection.js",
        "id": "cordova-plugin-ace.SetterBaseCollection",
        "merges": [
            "ace.SetterBaseCollection"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/collections/UIElementCollection.js",
        "id": "cordova-plugin-ace.UIElementCollection",
        "merges": [
            "ace.UIElementCollection"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/panels/Panel.js",
        "id": "cordova-plugin-ace.Panel",
        "merges": [
            "ace.Panel"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/panels/Canvas.js",
        "id": "cordova-plugin-ace.Canvas",
        "merges": [
            "ace.Canvas"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/panels/Grid.js",
        "id": "cordova-plugin-ace.Grid",
        "merges": [
            "ace.Grid"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/panels/StackPanel.js",
        "id": "cordova-plugin-ace.StackPanel",
        "merges": [
            "ace.StackPanel"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/Frame.js",
        "id": "cordova-plugin-ace.Frame",
        "merges": [
            "ace.Frame"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/Page.js",
        "id": "cordova-plugin-ace.Page",
        "merges": [
            "ace.Page"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/ButtonBase.js",
        "id": "cordova-plugin-ace.ButtonBase",
        "merges": [
            "ace.ButtonBase"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/Button.js",
        "id": "cordova-plugin-ace.Button",
        "merges": [
            "ace.Button"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/ColumnDefinition.js",
        "id": "cordova-plugin-ace.ColumnDefinition",
        "merges": [
            "ace.ColumnDefinition"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/CommandBar.js",
        "id": "cordova-plugin-ace.CommandBar",
        "merges": [
            "ace.CommandBar"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/DatePicker.js",
        "id": "cordova-plugin-ace.DatePicker",
        "merges": [
            "ace.DatePicker"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/AppBarButton.js",
        "id": "cordova-plugin-ace.AppBarButton",
        "merges": [
            "ace.AppBarButton"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/Geometry.js",
        "id": "cordova-plugin-ace.Geometry",
        "merges": [
            "ace.Geometry"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/HyperlinkButton.js",
        "id": "cordova-plugin-ace.HyperlinkButton",
        "merges": [
            "ace.HyperlinkButton"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/Image.js",
        "id": "cordova-plugin-ace.Image",
        "merges": [
            "ace.Image"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/PathSegment.js",
        "id": "cordova-plugin-ace.PathSegment",
        "merges": [
            "ace.PathSegment"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/LineSegment.js",
        "id": "cordova-plugin-ace.LineSegment",
        "merges": [
            "ace.LineSegment"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/ListBox.js",
        "id": "cordova-plugin-ace.ListBox",
        "merges": [
            "ace.ListBox"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/ListBoxItem.js",
        "id": "cordova-plugin-ace.ListBoxItem",
        "merges": [
            "ace.ListBoxItem"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/Shape.js",
        "id": "cordova-plugin-ace.Shape",
        "merges": [
            "ace.Shape"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/Path.js",
        "id": "cordova-plugin-ace.Path",
        "merges": [
            "ace.Path"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/PathFigure.js",
        "id": "cordova-plugin-ace.PathFigure",
        "merges": [
            "ace.PathFigure"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/PathGeometry.js",
        "id": "cordova-plugin-ace.PathGeometry",
        "merges": [
            "ace.PathGeometry"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/Popup.js",
        "id": "cordova-plugin-ace.Popup",
        "merges": [
            "ace.Popup"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/RowDefinition.js",
        "id": "cordova-plugin-ace.RowDefinition",
        "merges": [
            "ace.RowDefinition"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/Style.js",
        "id": "cordova-plugin-ace.Style",
        "merges": [
            "ace.Style"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/Setter.js",
        "id": "cordova-plugin-ace.Setter",
        "merges": [
            "ace.Setter"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/StaticResource.js",
        "id": "cordova-plugin-ace.StaticResource",
        "merges": [
            "ace.StaticResource"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/TabBar.js",
        "id": "cordova-plugin-ace.TabBar",
        "merges": [
            "ace.TabBar"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/TableView.js",
        "id": "cordova-plugin-ace.TableView",
        "merges": [
            "ace.TableView"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/TableViewCell.js",
        "id": "cordova-plugin-ace.TableViewCell",
        "merges": [
            "ace.TableViewCell"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/TextBlock.js",
        "id": "cordova-plugin-ace.TextBlock",
        "merges": [
            "ace.TextBlock"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/TimePicker.js",
        "id": "cordova-plugin-ace.TimePicker",
        "merges": [
            "ace.TimePicker"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/ToggleSwitch.js",
        "id": "cordova-plugin-ace.ToggleSwitch",
        "merges": [
            "ace.ToggleSwitch"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/framework/WebView.js",
        "id": "cordova-plugin-ace.WebView",
        "merges": [
            "ace.WebView"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/xbf/BinaryReader.js",
        "id": "cordova-plugin-ace.BinaryReader",
        "merges": [
            "ace.BinaryReader"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/xbf/NodeType.js",
        "id": "cordova-plugin-ace.NodeType",
        "merges": [
            "ace.NodeType"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/xbf/XamlNode.js",
        "id": "cordova-plugin-ace.XamlNode",
        "merges": [
            "ace.XamlNode"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/xbf/XbfReader.js",
        "id": "cordova-plugin-ace.XbfReader",
        "merges": [
            "ace.XbfReader"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/xbf/NodeToElement.js",
        "id": "cordova-plugin-ace.NodeToElement",
        "merges": [
            "ace.NodeToElement"
        ]
    },
    {
        "file": "plugins/cordova-plugin-ace/www/android/platform.js",
        "id": "cordova-plugin-ace.platform",
        "merges": [
            "ace.platform"
        ]
    },
    {
        "file": "plugins/cordova-plugin-splashscreen/www/splashscreen.js",
        "id": "cordova-plugin-splashscreen.SplashScreen",
        "clobbers": [
            "navigator.splashscreen"
        ]
    }
];
module.exports.metadata = 
// TOP OF METADATA
{
    "bidchat-photo-picker": "0.0.1",
    "bidchat-plugin-gradle": "1.0.0",
    "cordova-plugin-ace": "0.1.2",
    "cordova-plugin-splashscreen": "4.0.0",
    "cordova-plugin-whitelist": "1.3.0"
};
// BOTTOM OF METADATA
});