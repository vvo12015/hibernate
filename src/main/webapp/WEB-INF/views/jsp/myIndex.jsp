<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Бесплатный шаблон сайта ресторана</title>
	
	
	<meta name="keywords" content="ресторан харчування відпочинок">
	<meta name="description" content="ресторан смачного якісного харчування">

	<link rel="shortcut icon" href="http://resources.srv4.ascont.ru/users/4544/favicon.ico" type="image/x-icon">
	<link href="<c:url value="/resources/css/reset.css" />" rel="stylesheet">
	<link href="<c:url value="/resources/css/shadowbox.css" />" rel="stylesheet">
	<link href="<c:url value="/resources/css/global.css" />" rel="stylesheet">
	<link href="<c:url value="/resources/css/gallery.css" />" rel="stylesheet">

	<script src="<c:url value="/resources/js/prototype.js" />"></script>
	<script src="<c:url value="/resources/js/scriptaculous.js" />"></script>
	<script src="<c:url value="/resources/js/effects.js" />"></script>
	<script src="<c:url value="/resources/js/builder.js" />"></script>
	<script src="<c:url value="/resources/js/shadedborder.js" />"></script>

	<style type="text/css">
        .sb, .sbi, .sb *, .sbi *
            { position:relative; z-index:1; }
        * html .sb, * html .sbi
            { height:1%; }
        .sbi
            { display:inline-block; }
        .sb-inner
            { background:#ddd; }
        .sb-shadow
            { background:#000; }
        .sb-border
            { background:#bbb; }
	</style>
	<script src="<c:url value="/resources/js/global.js" />"></script>
	<script src="<c:url value="/resources/js/cssquery2-p.js" />"></script>
	<script src="<c:url value="/resources/js/ruzeeborders.js" />"></script>
	<script src="<c:url value="/resources/js/shadowbox.js" />"></script>
	<style type="text/css">/*.lleo_errorSelection
	    *::-moz-selection,
        .lleo_errorSelection *::selection,
        .lleo_errorSelection *::-webkit-selection
            {
                background-color: red !important;
                color: #fff !important;;
            }*/

        #lleo_dialog,
        #lleo_dialog * {
            color: #000 !important;
            font: normal 13px Arial, Helvetica !important;
            line-height: 15px !important;
            margin: 0 !important;
            padding: 0 !important;
            background: none !important;
            border: none 0 !important;
            position: static !important;
            vertical-align: baseline !important;
            overflow: visible !important;
            width: auto !important;
            height: auto !important;
            max-width: none !important;
            max-height: none !important;
            float: none !important;
            visibility: visible !important;
            text-align: left !important;
            text-transform: none !important;
            border-collapse: separate !important;
            border-spacing: 2px !important;
            box-sizing: content-box !important;
            box-shadow: none !important;
            opacity: 1 !important;
            text-shadow: none !important;
            letter-spacing: normal !important;
            -webkit-filter: none !important;
            -moz-filter: none !important;
            filter: none !important;
        }
        #lleo_dialog *:before,
        #lleo_dialog *:after {
            content: '';
        }

        #lleo_dialog iframe {
            height: 0 !important;
            width: 0 !important;
        }

        #lleo_dialog {
            position: absolute !important;
            background: #fff !important;
            border: solid 1px #ccc !important;
            padding: 7px 0 0 !important;
            left: -999px;
            top: -999px;
            width: 440px !important;
            overflow: hidden;
            display: block !important;
            z-index: 999999999 !important;
            box-shadow: 8px 16px 30px rgba(0, 0, 0, 0.16) !important;
            border-radius: 3px !important;
            opacity: 0 !important;
            -webkit-transform: translateY(15px);
            -moz-transform: translateY(15px);
            -ms-transform: translateY(15px);
            -o-transform: translateY(15px);
            transform: translateY(15px);
        }
        #lleo_dialog.lleo_show_small {
            width: 150px !important;
        }
        #lleo_dialog.lleo_show {
            opacity: 1 !important;
            -webkit-transform: translateY(0);
            -moz-transform: translateY(0);
            -ms-transform: translateY(0);
            -o-transform: translateY(0);
            transform: translateY(0);
            -webkit-transition: -webkit-transform 0.3s, opacity 0.3s !important;
            -moz-transition: -moz-transform 0.3s, opacity 0.3s !important;
            -ms-transition: -ms-transform 0.3s, opacity 0.3s !important;
            -o-transition: -o-transform 0.3s, opacity 0.3s !important;
            transition: transform 0.3s, opacity 0.3s !important;
        }
        #lleo_dialog.lleo_collapse {
            opacity: 0 !important;
            -webkit-transform: scale(0.25, 0.1) translate(-550px, 100px);
            -moz-transform: scale(0.25, 0.1) translate(-550px, 100px);
            -ms-transform: scale(0.25, 0.1) translate(-550px, 100px);
            -o-transform: scale(0.25, 0.1) translate(-550px, 100px);
            transform: scale(0.25, 0.1) translate(-550px, 100px);
            -webkit-transition: -webkit-transform 0.4s, opacity 0.4s !important;
            -moz-transition: -moz-transform 0.4s, opacity 0.4s !important;
            -ms-transition: -ms-transform 0.4s, opacity 0.4s !important;
            -o-transition: -o-transform 0.4s, opacity 0.4s !important;
            transition: transform 0.4s, opacity 0.4s !important;
        }
        #lleo_dialog input::-webkit-input-placeholder {
            color: #aaa !important;
        }
        #lleo_dialog .lleo_has_pic #lleo_word {
            margin-right: 80px !important;
        }
        #lleo_dialog #lleo_translationsContainer1 {
            position: relative !important;
        }
        #lleo_dialog #lleo_translationsContainer2 {
            padding: 7px 0 0 !important;
            vertical-align: middle !important;
        }
        #lleo_dialog #lleo_word {
            color: #000 !important;
            margin: 0 5px 2px 0 !important;
            /*float: left !important;*/
        }
        #lleo_dialog .lleo_has_sound #lleo_word {
            margin-left: 30px !important;
        }
        #lleo_dialog #lleo_text {
            font-weight: bold !important;
            color: #d56e00 !important;
            text-decoration: none !important;
            cursor: default !important;
        }
        /*
        #lleo_dialog #lleo_text.lleo_known {
            cursor: pointer !important;
            text-decoration: underline !important;
        }
        */
        /*#lleo_dialog #lleo_closeBtn {
            position: absolute !important;
            right: 6px !important;
            top: 5px !important;
            line-height: 1px !important;
            text-decoration: none !important;
            font-weight: bold !important;
            font-size: 0 !important;
            color: #aaa !important;
            display: block !important;
            z-index: 9999999999 !important;
            width: 7px !important;
            height: 7px !important;
            padding: 0 !important;
            margin: 0 !important;
        }*/

        #lleo_dialog #lleo_optionsBtn {
            position: absolute !important;
            right: 3px !important;
            top: 5px !important;
            line-height: 1px !important;
            text-decoration: none !important;
            font-weight: bold !important;
            font-size: 13px !important;
            color: #aaa !important;
            padding: 2px !important;
            display: none;
        }
            #lleo_dialog.lleo_optionsShown #lleo_optionsBtn {
                display: block !important;
            }
            #lleo_dialog #lleo_optionsBtn img {
                width: 12px !important;
                height: 12px !important;
            }
        #lleo_dialog #lleo_sound {
            float: left !important;
            width: 16px !important;
            height: 16px !important;
            margin-left: 9px !important;
            margin-right: 3px !important;
            background: 0 0 no-repeat !important;
            cursor: pointer !important;
            display: none !important;
            background: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAfNJREFUeNq0U01IVFEU/u57Oo5WhBRIBBptykWLYBa2soWiEKQQEbrSFsGbVRQKQc2iFqGitXqvjQxCoCJCqyI0aBUtZILaJNUuYWYWo8HovJ/707nP94bnz0rxwvfOuefd8517fi5TSuE4i50YwZ3l37ZhNlpgzFkaaM/G9sHF1YskNrT+7l4PjMOcb78t2JL71uxgB+2UlfxHTtq5N94fIOh/88kWgWfl73ZCSQkpeGg3H091JY6dI2S00qA/N3KO3dDUYhFgEmZGurG+w9FqApIHsVM7kaTF9Nhn0r8Q7hPWQgIRuNaH3AMUA4W/Lkdh04cpFS43G0TgxQTvCdMETVAk3KynIHwXZU/ge8XDt7KH9bKLjU0P2zVO5LsEpSejVRJ9UR18EtfqKegovs9R3Q6w9c/H1o4Aa2Jwm1lIvn9RJ4w9RdRRzqcYrpwycCll4Cy1lnkS3Bc6vfBg28v8aRIfI78zhB/1GygROH3jLyyzMQ0zlUZuZBSlKkeLoegGtTjYLcJ8pF+NakHOFC2J6w+f25mxSfWrWFF/ShXVPTGvtN14NNkVnxlYWJkgZEL7/vwKr55lKSVnaGYWkuYgrgG172uUv47+U7fw0EHaJXmalUQy/HqO6lBzEsVjJC4Q8kd6TETQpjuaGOvjv8b/AgwA/ij1XMx58NIAAAAASUVORK5CYII=) !important;
        }
        #lleo_dialog .lleo_has_sound #lleo_sound {
            display: block !important;
        }

        #lleo_dialog #lleo_soundWave {
            border: solid 5px #4495CC !important;
            border-radius: 5px !important;
            position: absolute !important;
            left: -5px !important;
            top: -5px !important;
            right: -5px !important;
            bottom: -5px !important;
            z-index: 0 !important;
            opacity: 0.9 !important;
            display: none !important;
        }
            #lleo_dialog #lleo_soundWave.lleo_beforePlaying {
                display: block !important;
            }
            #lleo_dialog #lleo_soundWave.lleo_playing {
                opacity: 0 !important;
                border-width: 20px !important;
                border-radius: 30px !important;

                -webkit-transform: scale(1.07,1.1) !important;
                -moz-transform: scale(1.07,1.1) !important;
                -ms-transform: scale(1.07,1.1) !important;
                transform: scale(1.07,1.1) !important;

                -webkit-transition: all 0.6s !important;
                -moz-transition: all 0.6s !important;
                -ms-transition: all 0.6s !important;
                transition: all 0.6s !important;
            }


        #lleo_dialog #lleo_picOuter {
            position: absolute !important;
            float: right !important;
            top: 4px;
            right: 5px;
            z-index: 9 !important;
            display: none !important;
            width: 100px !important;
        }
            #lleo_dialog.lleo_optionsShown #lleo_picOuter {
                right: 25px;
            }
        #lleo_dialog .lleo_has_pic #lleo_picOuter {
            display: block !important;
        }
            #lleo_dialog #lleo_picOuter:hover {
                width: auto !important;
                z-index: 11 !important;
            }
        #lleo_dialog #lleo_pic,
        #lleo_dialog #lleo_picBig {
            position: absolute !important;
            top: 0 !important;
            right: 0 !important;
            border: solid 2px #fff !important;
            -webkit-border-radius: 2px !important;
            -moz-border-radius: 2px !important;
            border-radius: 2px !important;
            z-index: 1 !important;
        }
        #lleo_dialog #lleo_pic {
            position: relative !important;
            border: none !important;
            width: 30px !important;
        }
        #lleo_dialog #lleo_picBig {
            box-shadow: -1px 2px 4px rgba(0,0,0,0.3);
            z-index: 2 !important;
            opacity: 0 !important;
            visibility: hidden !important;
        }
            #lleo_dialog #lleo_picOuter:hover #lleo_picBig {
                visibility: visible !important;
                opacity: 1 !important;
                -webkit-transition: opacity 0.3s !important;
                -webkit-transition-delay: 0.3s !important;
            }
        #lleo_dialog #lleo_transcription {
            margin: 0 80px 4px 31px !important;
            color: #aaaaaa !important;
        }
        #lleo_dialog .lleo_no_trans {
            color: #aaa !important;
        }

        #lleo_dialog .ll-translation-counter {
            float: right !important;
            font-size: 11px !important;
            color: #aaa !important;
            padding: 2px 2px 1px 10px !important;
        }

        #lleo_dialog .ll-translation-text {
            float: left !important;
            /*width: 80% !important;*/
        }

        #lleo_dialog #lleo_trans a {
            color: #3F669F !important;
            text-decoration: none !important;
            text-overflow: ellipsis !important;
            padding: 1px 4px !important;
            overflow: hidden !important;
            float: left !important;
            width: 320px !important;
        }

        #lleo_dialog .ll-translation-item {
            color: #3F669F !important;
            border: solid 1px #fff !important;
            padding: 3px !important;
            width: 100% !important;
            float: left !important;
            -moz-border-radius: 2px !important;
            -webkit-border-radius: 2px !important;
            border-radius: 2px !important;
        }

        #lleo_dialog .ll-translation-item:hover {
            border: solid 1px #9FC2C9 !important;
            background: #EDF4F6 !important;
            cursor: pointer !important;
        }
        #lleo_dialog .ll-translation-item:hover .ll-translation-counter {
            color: #83a0a6 !important;
        }

        #lleo_dialog .ll-translation-marker {
            background: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAQAAAAECAYAAACp8Z5+AAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAAJcEhZcwAADsQAAA7EAZUrDhsAAAAWSURBVBhXY7RPm/+fAQkwIXNAbMICAJQ8AkvqWg/SAAAAAElFTkSuQmCC) !important;
            display: inline-block !important;
            width: 4px !important;
            height: 4px !important;
            margin: 7px 5px 2px 2px !important;
            float: left !important;
        }

        #lleo_dialog #lleo_icons {
            color: #aaa !important;
            font-size: 11px !important;
            background: #f8f8f8 !important;
            padding: 10px 10px 10px 16px !important;
        }
        #lleo_icons a {
            display: inline-block !important;
            width: 16px !important;
            height: 16px !important;
            margin: 0 10px -4px 3px !important;
            text-decoration: none !important;
            opacity: 0.5 !important;
            background: url(data:image/png;base64,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) !important;
        }
        #lleo_icons a:hover {
            opacity: 1 !important;
        }
        #lleo_icons a.lleo_google     {background-position:-34px 0 !important;}
        #lleo_icons a.lleo_multitran  {background-position:-64px 0 !important;}
        #lleo_icons a.lleo_lingvo     {background-position:-51px 0 !important; width: 12px !important;}
        #lleo_icons a.lleo_dict       {background-position:-17px 0 !important;}
        #lleo_icons a.lleo_linguee    {background-position:-81px 0 !important;}
        #lleo_icons a.lleo_michaelis  {background-position:-98px 0 !important;}

        #lleo_dialog #lleo_contextContainer {
            margin: 0 !important;
            padding: 3px 15px 8px 10px !important;
            background: #eee !important;
            background: -webkit-gradient(linear, left top, left bottom, from(#fff), to(#eee)) !important;
            background: -moz-linear-gradient(-90deg, #fff, #eee) !important;
            border-bottom: solid 1px #ddd !important;
            border-top-left-radius: 3px !important;
            border-top-right-radius: 3px !important;
            display: none !important;
            overflow: hidden !important;
        }
        #lleo_dialog .lleo_has_context #lleo_contextContainer {
            display: block !important;
        }
        #lleo_dialog #lleo_context {
            color: #444 !important;
            text-shadow: 1px 1px 0 #f4f4f4 !important;
            line-height: 12px !important;
            font-size: 11px !important;
            margin-left: 2px !important;
        }
        #lleo_dialog #lleo_context b {
            line-height: 12px !important;
            color: #000 !important;
            font-weight: bold !important;
            font-size: 11px !important;
        }
        /*#lleo_dialog #lleo_gBrand {
            color: #aaa !important;
            font-size: 10px !important;
            *//*padding-right: 52px !important;*//*
            padding-bottom: 14px !important;
            margin: -3px 4px 0 4px !important;
            background: left bottom url(data:image/png;base64,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) no-repeat !important;
            display: inline-block !important;
            float: right !important;
        }
        #lleo_dialog #lleo_gBrand.hidden {
            display: none !important;
        }*/
        #lleo_dialog #lleo_translateContextLink {
            color: #444 !important;
            text-shadow: 1px 1px 0 #f4f4f4 !important;
            background: -webkit-gradient(linear, left top, left bottom, from(#f4f4f4), to(#ddd)) !important;
            background: -moz-linear-gradient(-90deg, #f4f4f4, #ddd) !important;
            border: solid 1px !important;
            box-shadow: 1px 1px 0 #f6f6f6 !important;
            border-color: #999 #aaa #aaa #999 !important;
            -moz-border-radius: 2px !important;
            -webkit-border-radius: 2px !important;
            border-radius: 2px !important;
            padding: 0 3px !important;
            font-size: 11px !important;
            text-decoration: none !important;
            margin: 1px 5px 0 !important;
            display: inline-block !important;
            white-space: nowrap !important;
        }
        #lleo_dialog #lleo_translateContextLink:hover {
            background: #f8f8f8 !important;
        }
        #lleo_dialog #lleo_translateContextLink.hidden {
            visibility: hidden !important;
        }

        #lleo_dialog #lleo_setTransForm {
            display: block !important;
            margin-top: 3px !important;
            padding-top: 5px !important;
            /* Set position and background because the form might be overlapped by an image when no translations */
            position: relative !important;
            background: #fff !important;
            z-index: 10 !important;
            padding-bottom: 10px !important;
            padding-left: 16px !important;
        }
        #lleo_dialog .lleo-custom-translation {
            padding: 4px 5px !important;
            border: solid 1px #ddd !important;
            border-radius: 2px !important;
            width: 90% !important;
            min-width: 270px !important;
            background: -webkit-gradient(linear, 0 0, 0 20, from(#f1f1f1), to(#fff)) !important;
            background: -moz-linear-gradient(-90deg, #f1f1f1, #fff) !important;
            font: normal 13px Arial, Helvetica !important;
            line-height: 15px !important;
        }
        #lleo_dialog .lleo-custom-translation:hover {
            border: solid 1px #aaa !important;
        }
        #lleo_dialog .lleo-custom-translation:focus {
            background: #FFFEC9 !important;
        }

        #lleo_dialog *.hidden {
            display: none !important;
        }

        #lleo_dialog .infinitive{
            color: #D56E00 !important;
            text-decoration: none;
            border-bottom: 1px dotted #D56E00 !important;
        }
        #lleo_dialog .infinitive:hover{
            border: none !important;
        }

        #lleo_dialog .lleo_separator {
            height: 1px !important;
            background: #eee;
            margin-top: 10px !important;
            background: -webkit-linear-gradient(left, rgba(255,255,255,1) 0%,#eee 8%,rgba(255,255,255,1) 80%) !important;
            background: -moz-linear-gradient(left, rgba(255,255,255,1) 0%, #eee 8%, rgba(255,255,255,1) 80%) !important;
            background: -ms-linear-gradient(left, rgba(255,255,255,1) 0%,#eee 8%,rgba(255,255,255,1) 80%) !important;
            background: linear-gradient(to right, rgba(255,255,255,1) 0%,#eee 8%,rgba(255,255,255,1) 80%) !important;
        }
        #lleo_dialog #lleo_trans {
            /*border-top: 1px solid #eeeeee !important;*/
            padding: 5px 30px 0 14px !important;
            zoom: 1;
        }

        #lleo_dialog .lleo_clearfix {
            display: block !important;
            clear: both !important;
            visibility: hidden !important;
            height: 0 !important;
            font-size: 0 !important;
        }


        #lleo_dialog #lleo_picOuter table {
            width: 44px !important;
            position: absolute !important;
            right: 0 !important;
            top: 0 !important;
            vertical-align: middle !important;
        }

        #lleo_dialog #lleo_picOuter td {
            width: 38px !important;
            height: 38px !important;
            /*border: 1px solid #eeeeee !important;*/
            vertical-align: middle !important;
            text-align: center !important;
        }

        #lleo_dialog #lleo_picOuter td div {
            height: 38px !important;
            overflow: hidden !important;
        }

        #lleo_dialog .lleo_empty {
            margin: 0 5px 7px !important;
        }

        #lleo_youtubeExportBtn {
            margin-left: 10px;
            height: 24px;
        }
            #lleo_youtubeExportBtn i {
                display: inline-block;
                width: 16px;
                height: 16px;
                background: 0 0 url(https://d144fqpiyasmrr.cloudfront.net/plugins/all/images/i16.png) !important;
            }
            #lleo_youtubeExportBtn .yt-uix-button-content {
                font-size: 12px;
                line-height: 2px;
            }


        /*** Parsed Lyrics Content *****************************/

        .lleo_lyrics tran {
            background: transparent !important;
            border-radius: 2px !important;
            text-shadow: none !important;
            cursor: pointer !important;
        }
            .lleo_lyrics tran:hover {
                color: #fff !important;
                background: #C77213 !important;
                -webkit-transition: all 0.1s !important;
                -moz-transition: all 0.1s !important;
                -ms-transition: all 0.1s !important;
                -o-transition: all 0.1s !important;
                transition: all 0.1s !important;
            }

        .lleo_songName {
            border: solid 1px #ffd47c;
            background: #fff1c2;
            border-radius: 2px;
        }

        .lleo_hidden_iframe {
            visibility: hidden;
        }</style></head>

<body>

<div id="outer">
    <div class="closed-margin">
    <div class="closed-box" id="closed_box">
 	    

<div id="header" class="pnged">
	<a id="logo" href="index" title="У Валентина">
	    У Валентина
	    
	</a>
	
	<div id="ban">
<div style="padding-top: 40px;">
<p>Дзвоніть для резервування</p>
<p><span>+38 050-11-111-11</span></p>
</div>
</div>
			

    
    
</div>    
	
    	
    	

<div class="tmenu pnged">
<div class="hmenu-container">
    <ul id="page_tabs" class="page_tabs">
    
	<li id="menu_item_53930" class="mli activelink pnged">
	    <a href="http://restaurant1.sites.xn--80aagbla3am5aqmo9n.xn--p1ai/">Главная</a>
	    
	</li>
	
	<li id="menu_item_53935" class="mli pnged">
	    <a href="http://restaurant1.sites.xn--80aagbla3am5aqmo9n.xn--p1ai/about">О нас</a>
	    
	</li>
	
	<li id="menu_item_53939" class="mli pnged">
	    <a href="http://restaurant1.sites.xn--80aagbla3am5aqmo9n.xn--p1ai/%D0%9C%D0%B5%D0%BD%D1%8E/">Меню</a>
	    
	</li>
	
	<li id="menu_item_53938" class="mli pnged">
	    <a href="http://restaurant1.sites.xn--80aagbla3am5aqmo9n.xn--p1ai/%D0%9D%D0%BE%D0%B2%D0%BE%D1%81%D1%82%D0%B8">Новости</a>
	    
	</li>
	
	<li id="menu_item_53931" class="mli pnged">
	    <a href="http://restaurant1.sites.xn--80aagbla3am5aqmo9n.xn--p1ai/%D0%9A%D0%BE%D0%BD%D1%82%D0%B0%D0%BA%D1%82%D1%8B">Контакты</a>
	    
	</li>
	
    </ul>
</div>
</div>
    	
	    <div class="main-area" id="main_area">
	    <script src="<c:url value="/resources/js/coin-slider.min.js" />"></script>
	    <div class="coin-slider" id="coin-slider-coin-slider"><div id="coin-slider" style="background-image: url(&quot;http://design-restaurant1.ascont.ru/users/4544/photos/editor/slide01.jpg&quot;); width: 1010px; height: 497px; position: relative; background-position: left top;">
	<a href="">

		<img src="<c:url value="/resources/img/slide01.jpg" />" style="display: none;">
		<span style="display: none;">
		Працюємо для Вашого задоволення
		</span>
	</a>
	<a href="">
		<img src="./Бесплатный шаблон сайта ресторана_files/slide02.jpg" style="display: none;">
		<span style="display: none;">
		Доступні цени!
		</span>
	</a>
        <a href="">
		<img src="./Бесплатный шаблон сайта ресторана_files/slide03.jpg" style="display: none;">
		<span style="display: none;">
		Смачного!
		</span>
	</a>

<div class="cs-title" id="cs-title-coin-slider" style="position: absolute; bottom: 0px; left: 0px; z-index: 1000; opacity: 1;">
		Доступные цены!	
		</div>
		<a href="" class="cs-coin-slider" id="cs-coin-slider11" 
		style="width: 145px; height: 100px; float: left; position: absolute; background-position: 0px 0px; left: 0px; top: 0px; opacity: 1; background-image: url(&quot;http://design-restaurant1.ascont.ru/users/4544/photos/editor/slide02.jpg&quot;);" target=""></a>
		<a href="" class="cs-coin-slider" id="cs-coin-slider12" 
		style="width: 145px; height: 100px; float: left; position: absolute; background-position: -145px 0px; left: 145px; top: 0px; opacity: 1; background-image: url(&quot;http://design-restaurant1.ascont.ru/users/4544/photos/editor/slide02.jpg&quot;);" target=""></a>
		<a href="" class="cs-coin-slider" id="cs-coin-slider13" style="width: 144px; height: 100px; float: left; position: absolute; background-position: -290px 0px; left: 290px; top: 0px; opacity: 1; background-image: url(&quot;http://design-restaurant1.ascont.ru/users/4544/photos/editor/slide02.jpg&quot;);" target=""></a>
		<a href="" class="cs-coin-slider" id="cs-coin-slider14" style="width: 144px; height: 100px; float: left; position: absolute; background-position: -434px 0px; left: 434px; top: 0px; opacity: 1; background-image: url(&quot;http://design-restaurant1.ascont.ru/users/4544/photos/editor/slide02.jpg&quot;);" target=""></a>
		<a href="" class="cs-coin-slider" id="cs-coin-slider15" style="width: 144px; height: 100px; float: left; position: absolute; background-position: -578px 0px; left: 578px; top: 0px; opacity: 1; background-image: url(&quot;http://design-restaurant1.ascont.ru/users/4544/photos/editor/slide02.jpg&quot;);" target=""></a>
		<a href="" class="cs-coin-slider" id="cs-coin-slider16" style="width: 144px; height: 100px; float: left; position: absolute; background-position: -722px 0px; left: 722px; top: 0px; opacity: 1; background-image: url(&quot;http://design-restaurant1.ascont.ru/users/4544/photos/editor/slide02.jpg&quot;);" target=""></a>
		<a href="" class="cs-coin-slider" id="cs-coin-slider17" style="width: 144px; height: 100px; float: left; position: absolute; background-position: -866px 0px; left: 866px; top: 0px; opacity: 1; background-image: url(&quot;http://design-restaurant1.ascont.ru/users/4544/photos/editor/slide02.jpg&quot;);" target=""></a>
		<a href="" class="cs-coin-slider" id="cs-coin-slider21" style="width: 145px; height: 100px; float: left; position: absolute; background-position: 0px -100px; left: 0px; top: 100px; opacity: 1; background-image: url(&quot;http://design-restaurant1.ascont.ru/users/4544/photos/editor/slide02.jpg&quot;);" target=""></a>
		<a href="" class="cs-coin-slider" id="cs-coin-slider22" style="width: 145px; height: 100px; float: left; position: absolute; background-position: -145px -100px; left: 145px; top: 100px; opacity: 1; background-image: url(&quot;http://design-restaurant1.ascont.ru/users/4544/photos/editor/slide02.jpg&quot;);" target=""></a>
		<a href="" class="cs-coin-slider" id="cs-coin-slider23" style="width: 144px; height: 100px; float: left; position: absolute; background-position: -290px -100px; left: 290px; top: 100px; opacity: 1; background-image: url(&quot;http://design-restaurant1.ascont.ru/users/4544/photos/editor/slide02.jpg&quot;);" target=""></a>
		<a href="" class="cs-coin-slider" id="cs-coin-slider24" style="width: 144px; height: 100px; float: left; position: absolute; background-position: -434px -100px; left: 434px; top: 100px; opacity: 1; background-image: url(&quot;http://design-restaurant1.ascont.ru/users/4544/photos/editor/slide02.jpg&quot;);" target=""></a>
		<a href="" class="cs-coin-slider" id="cs-coin-slider25" style="width: 144px; height: 100px; float: left; position: absolute; background-position: -578px -100px; left: 578px; top: 100px; opacity: 1; background-image: url(&quot;http://design-restaurant1.ascont.ru/users/4544/photos/editor/slide02.jpg&quot;);" target=""></a>
		<a href="" class="cs-coin-slider" id="cs-coin-slider26" style="width: 144px; height: 100px; float: left; position: absolute; background-position: -722px -100px; left: 722px; top: 100px; opacity: 1; background-image: url(&quot;http://design-restaurant1.ascont.ru/users/4544/photos/editor/slide02.jpg&quot;);" target=""></a>
		<a href="" class="cs-coin-slider" id="cs-coin-slider27" style="width: 144px; height: 100px; float: left; position: absolute; background-position: -866px -100px; left: 866px; top: 100px; opacity: 1; background-image: url(&quot;http://design-restaurant1.ascont.ru/users/4544/photos/editor/slide02.jpg&quot;);" target=""></a>
		<a href="" class="cs-coin-slider" id="cs-coin-slider31" style="width: 145px; height: 99px; float: left; position: absolute; background-position: 0px -200px; left: 0px; top: 200px; opacity: 1; background-image: url(&quot;http://design-restaurant1.ascont.ru/users/4544/photos/editor/slide02.jpg&quot;);" target=""></a>
		<a href="" class="cs-coin-slider" id="cs-coin-slider32" style="width: 145px; height: 99px; float: left; position: absolute; background-position: -145px -200px; left: 145px; top: 200px; opacity: 1; background-image: url(&quot;http://design-restaurant1.ascont.ru/users/4544/photos/editor/slide02.jpg&quot;);" target=""></a>
		<a href="" class="cs-coin-slider" id="cs-coin-slider33" style="width: 144px; height: 99px; float: left; position: absolute; background-position: -290px -200px; left: 290px; top: 200px; opacity: 1; background-image: url(&quot;http://design-restaurant1.ascont.ru/users/4544/photos/editor/slide02.jpg&quot;);" target=""></a>
		<a href="" class="cs-coin-slider" id="cs-coin-slider34" style="width: 144px; height: 99px; float: left; position: absolute; background-position: -434px -200px; left: 434px; top: 200px; opacity: 1; background-image: url(&quot;http://design-restaurant1.ascont.ru/users/4544/photos/editor/slide02.jpg&quot;);" target=""></a>
		<a href="" class="cs-coin-slider" id="cs-coin-slider35" style="width: 144px; height: 99px; float: left; position: absolute; background-position: -578px -200px; left: 578px; top: 200px; opacity: 1; background-image: url(&quot;http://design-restaurant1.ascont.ru/users/4544/photos/editor/slide02.jpg&quot;);" target=""></a>
		<a href="" class="cs-coin-slider" id="cs-coin-slider36" style="width: 144px; height: 99px; float: left; position: absolute; background-position: -722px -200px; left: 722px; top: 200px; opacity: 1; background-image: url(&quot;http://design-restaurant1.ascont.ru/users/4544/photos/editor/slide02.jpg&quot;);" target=""></a>
		<a href="" class="cs-coin-slider" id="cs-coin-slider37" style="width: 144px; height: 99px; float: left; position: absolute; background-position: -866px -200px; left: 866px; top: 200px; opacity: 1; background-image: url(&quot;http://design-restaurant1.ascont.ru/users/4544/photos/editor/slide02.jpg&quot;);" target=""></a><a href="" class="cs-coin-slider" id="cs-coin-slider41" style="width: 145px; height: 99px; float: left; position: absolute; background-position: 0px -299px; left: 0px; top: 299px; opacity: 1; background-image: url(&quot;http://design-restaurant1.ascont.ru/users/4544/photos/editor/slide02.jpg&quot;);" target=""></a><a href="" class="cs-coin-slider" id="cs-coin-slider42" style="width: 145px; height: 99px; float: left; position: absolute; background-position: -145px -299px; left: 145px; top: 299px; opacity: 1; background-image: url(&quot;http://design-restaurant1.ascont.ru/users/4544/photos/editor/slide02.jpg&quot;);" target=""></a><a href="" class="cs-coin-slider" id="cs-coin-slider43" style="width: 144px; height: 99px; float: left; position: absolute; background-position: -290px -299px; left: 290px; top: 299px; opacity: 1; background-image: url(&quot;http://design-restaurant1.ascont.ru/users/4544/photos/editor/slide02.jpg&quot;);" target=""></a><a href="" class="cs-coin-slider" id="cs-coin-slider44" style="width: 144px; height: 99px; float: left; position: absolute; background-position: -434px -299px; left: 434px; top: 299px; opacity: 1; background-image: url(&quot;http://design-restaurant1.ascont.ru/users/4544/photos/editor/slide02.jpg&quot;);" target=""></a><a href="" class="cs-coin-slider" id="cs-coin-slider45" style="width: 144px; height: 99px; float: left; position: absolute; background-position: -578px -299px; left: 578px; top: 299px; opacity: 1; background-image: url(&quot;http://design-restaurant1.ascont.ru/users/4544/photos/editor/slide02.jpg&quot;);" target=""></a><a href="" class="cs-coin-slider" id="cs-coin-slider46" style="width: 144px; height: 99px; float: left; position: absolute; background-position: -722px -299px; left: 722px; top: 299px; opacity: 1; background-image: url(&quot;http://design-restaurant1.ascont.ru/users/4544/photos/editor/slide02.jpg&quot;);" target=""></a><a href="" class="cs-coin-slider" id="cs-coin-slider47" style="width: 144px; height: 99px; float: left; position: absolute; background-position: -866px -299px; left: 866px; top: 299px; opacity: 1; background-image: url(&quot;http://design-restaurant1.ascont.ru/users/4544/photos/editor/slide02.jpg&quot;);" target=""></a><a href="" class="cs-coin-slider" id="cs-coin-slider51" style="width: 145px; height: 99px; float: left; position: absolute; background-position: 0px -398px; left: 0px; top: 398px; opacity: 1; background-image: url(&quot;http://design-restaurant1.ascont.ru/users/4544/photos/editor/slide02.jpg&quot;);" target=""></a><a href="" class="cs-coin-slider" id="cs-coin-slider52" style="width: 145px; height: 99px; float: left; position: absolute; background-position: -145px -398px; left: 145px; top: 398px; opacity: 1; background-image: url(&quot;http://design-restaurant1.ascont.ru/users/4544/photos/editor/slide02.jpg&quot;);" target=""></a><a href="" class="cs-coin-slider" id="cs-coin-slider53" style="width: 144px; height: 99px; float: left; position: absolute; background-position: -290px -398px; left: 290px; top: 398px; opacity: 1; background-image: url(&quot;http://design-restaurant1.ascont.ru/users/4544/photos/editor/slide02.jpg&quot;);" target=""></a><a href="" class="cs-coin-slider" id="cs-coin-slider54" style="width: 144px; height: 99px; float: left; position: absolute; background-position: -434px -398px; left: 434px; top: 398px; opacity: 1; background-image: url(&quot;http://design-restaurant1.ascont.ru/users/4544/photos/editor/slide02.jpg&quot;);" target=""></a><a href="" class="cs-coin-slider" id="cs-coin-slider55" style="width: 144px; height: 99px; float: left; position: absolute; background-position: -578px -398px; left: 578px; top: 398px; opacity: 1; background-image: url(&quot;http://design-restaurant1.ascont.ru/users/4544/photos/editor/slide02.jpg&quot;);" target=""></a><a href="" class="cs-coin-slider" id="cs-coin-slider56" style="width: 144px; height: 99px; float: left; position: absolute; background-position: -722px -398px; left: 722px; top: 398px; opacity: 1; background-image: url(&quot;http://design-restaurant1.ascont.ru/users/4544/photos/editor/slide02.jpg&quot;);" target=""></a><a href="" class="cs-coin-slider" id="cs-coin-slider57" style="width: 144px; height: 99px; float: left; position: absolute; background-position: -866px -398px; left: 866px; top: 398px; opacity: 1; background-image: url(&quot;http://design-restaurant1.ascont.ru/users/4544/photos/editor/slide02.jpg&quot;);" target=""></a></div></div>

<script type="text/javascript">
	$(document).ready(function() {
		$('#coin-slider').coinslider({ width: 1010, height: 497, navigation: false, delay: 5000 });
	});
</script>
			


<div class="panel panel-ucontent-24658 roundcorners">

	<div class="panel-body">
		<div class="blog-text"><p style="text-align: center; font-family: ClassicaTwoRegular;"><span style="font-size: xx-large;"><b><span style="color: #050505;">Ласкаво просимо на сайт ресторану!</span></b></span></p>
<p style="text-align: center; font-family: ClassicaTwoRegular;"><span style="font-size: xx-large;"><b><span style="color: #050505;"><br></span></b></span></p>
<p style="text-align: center;"><img src="<c:url value="/resources/img/lenta.jpg" />" height="26" width="968"></p></div>
	</div>
</div>
			

	        

<table class="table-content" cellpadding="0" cellspacing="0">
<tbody><tr>
	<td class="column left">
	
			
<div class="panel panel-18 roundcorners">


		<h3 class="title"><a href="http://restaurant1.sites.xn--80aagbla3am5aqmo9n.xn--p1ai/%D0%9D%D0%BE%D0%B2%D0%BE%D1%81%D1%82%D0%B8">Новость дня</a></h3>
				
		<div class="panel-body">	
			
				
					    
						<div class="basic-featured-news-item adv-featured-news-item-286465092" style="min-height:80px;">
							<div style="margin: 0px 20px 10px 0px;float:left;">
								<a class="mphoto box" style="width:80px;height:60px;" href="http://restaurant1.sites.xn--80aagbla3am5aqmo9n.xn--p1ai/%D0%9D%D0%BE%D0%B2%D0%BE%D1%81%D1%82%D0%B8/%D0%AD%D0%BD%D0%B5%D1%80%D0%B3%D0%BE%D1%80%D0%B5%D1%81%D1%83%D1%80%D1%81%D0%BE%D0%B2-%D0%BD%D0%B0%D0%BC-%D1%85%D0%B2%D0%B0%D1%82%D0%B8%D1%82-%D0%BD%D0%B0%D0%B4%D0%BE%D0%BB%D0%B3%D0%BE" title="Энергоресурсов нам хватит надолго">
								<img style="width:80px;height:60px;" src="./Бесплатный шаблон сайта ресторана_files/474b6475-b39a-491b-8e42-71cac0a1c5e2.jpg" alt="Энергоресурсов нам хватит надолго" title="Энергоресурсов нам хватит надолго">
								</a>
							</div>
							
							<div class="blog-preview">
								<p class="blog-title"><a href="http://restaurant1.sites.xn--80aagbla3am5aqmo9n.xn--p1ai/%D0%9D%D0%BE%D0%B2%D0%BE%D1%81%D1%82%D0%B8/%D0%AD%D0%BD%D0%B5%D1%80%D0%B3%D0%BE%D1%80%D0%B5%D1%81%D1%83%D1%80%D1%81%D0%BE%D0%B2-%D0%BD%D0%B0%D0%BC-%D1%85%D0%B2%D0%B0%D1%82%D0%B8%D1%82-%D0%BD%D0%B0%D0%B4%D0%BE%D0%BB%D0%B3%D0%BE">Энергоресурсов нам хватит надолго</a></p>
								<p class="blog-text">
								     Немецкие ученые пришли к выводу, что у нас нет причин опасаться истощения запасов мировых энергоресурсов. Полные результаты исследования «Энергоресурсы-2009: откуда берется энергия в 21 веке?» публикует германское федеральное ведомство по...
								  <a class="more more-news" href="http://restaurant1.sites.xn--80aagbla3am5aqmo9n.xn--p1ai/%D0%9D%D0%BE%D0%B2%D0%BE%D1%81%D1%82%D0%B8/%D0%AD%D0%BD%D0%B5%D1%80%D0%B3%D0%BE%D1%80%D0%B5%D1%81%D1%83%D1%80%D1%81%D0%BE%D0%B2-%D0%BD%D0%B0%D0%BC-%D1%85%D0%B2%D0%B0%D1%82%D0%B8%D1%82-%D0%BD%D0%B0%D0%B4%D0%BE%D0%BB%D0%B3%D0%BE">подробнее »</a>
								</p>
								<p class="blog-info" style="font-weight:bold;">
								    17.07.2012, 13:09
								    
								    
								    
								     
								    
								</p>
								
								
							</div>
							
						</div>
						
						
			
		</div>
</div>

<div class="panel panel-ucontent-24626 roundcorners">

	<h3 class="title">
	    
	        <a>Говорят наши клиенты</a>
	        
	</h3>
	
	<div class="panel-body">
		<div class="blog-text"><p>"<i>Компания «Ресторан Пальмира» помогла нам успешно решить целый спектр задач в короткие сроки и с блестящими результатами!</i>"&nbsp;</p>
<p style="text-align: right;">- <strong>Иванов И. И.<br>ООО «ABC-Consult»</strong></p>
<p>&nbsp;</p>
<p>"<i>Специалисты компании «Ресторан Пальмира» оказали нам неоценимую поддержку при решении технических проблем, возникших в нашей организации! Успехов вам в дальнейшей работе!</i>"&nbsp;</p>
<p style="text-align: right;">- <strong>Егорова А. А.<br>ООО «123-Service»</strong></p></div>
	</div>
</div>
			


<div class="panel panel-ucontent-24628 roundcorners">

	<h3 class="title">
	    
	        <a href="http://restaurant1.sites.xn--80aagbla3am5aqmo9n.xn--p1ai/%D0%9A%D0%BE%D0%BD%D1%82%D0%B0%D0%BA%D1%82%D1%8B">Наши контакты</a>
	        
	</h3>
	
	<div class="panel-body">
		<div class="blog-text"><p style="FONT-SIZE: 16px"><b>Ресторан Пальмира</b></p>
<p>тел: +7 (495) 123-45-67<br> email: info@palmira.ru<br><br></p>
<p style="FONT-SIZE: 16px"><b>Адрес</b></p>
<p>г.Москва, Россия</p></div>
	</div>
</div>
			

	</td>
	
	<td class="center-column">
	

<div class="panel panel-ucontent-24627 roundcorners">

	<h3 class="title">
	    
	        <a>Наши услуги</a>
	        
	</h3>
	
	<div class="panel-body">
		<div class="blog-text"><p>Используя в своей работе самые передовые методы и технологии, компания «Ресторан Пальмира» оказывает целый ряд услуг, помогая развитию вашего бизнеса.</p>
<p>Стремитесь к дальнейшему росту? Ищите новые рынки сбыта? Хотите более оптимально реструктуировать свою деятельность? &nbsp;<a href="http://restaurant1.sites.xn--80aagbla3am5aqmo9n.xn--p1ai/contacts">Свяжитесь с нами!</a> Мы с удовольствием поможем вам бесплатной консультацией и окажем всю информационную поддержку, чтобы вы cмогли принять эффективное решение.</p></div>
	</div>
</div>
			

			
<div class="panel panel-49 panel-49-286327857 roundcorners">


		<h3 class="title"><a href="http://restaurant1.sites.xn--80aagbla3am5aqmo9n.xn--p1ai/%D0%9C%D0%B5%D0%BD%D1%8E/">Наше меню</a></h3>
				
		<div class="panel-body">	
	        <div style="overflow:hidden;">
			    <div class="basic-other-products-item  adv-other-products-item-286327857">
				    <div id = "parentDishes" style="margin-bottom:0px;min-height:135px;">
                        <div id = "childDishes" style="margin: 0px 20px 10px 0px;float:left;">
                            <a class="mphoto box" style="width:208px;height:115px;" href="/dish?id=1" title="Салат">
                            </a>
                        </div>
                        <script>
                            var img = document.createElement('img');
                            img.style = "width:208px;height:115px;";
                            img.src = "<c:url value="/resources/img/8b9581a6-f04a-4b5f-bee0-db7c3c489c7a.jpg" />";
                            document.getElementById("parentDishes").appendChild(img);
                            img.alt = "Салат";
                            img.title = "Салат";

                            var div = document.createElement('div');
                            div.id = "test";
                            div.className = "blog-preview";
                            var p = document.createElement('p');
                            p.className = "blog-title";
                            p.innerHTML = "Салат";
                            div.appendChild(p);
                            document.getElementById("childDishes").appendChild(div);
                        </script>
                        <!--<div class="blog-preview">
                            <p class="blog-title">Салат</p>
                                Вага<br>
                                Ціна<br>
                                <a class="more more-items" href="/dish?id=1">більш детально</a>
                            </p>
                        </div>-->
                    </div>
			    </div>
			    <div class="basic-other-products-item  adv-other-products-item-286327857">
			        <div style="margin-bottom:0px;min-height:135px;">
						<div style="margin: 0px 20px 10px 0px;float:left;">
							<a class="mphoto box" style="width:208px;height:115px;" href="http://restaurant1.sites.xn--80aagbla3am5aqmo9n.xn--p1ai/%D0%9C%D0%B5%D0%BD%D1%8E/%D0%9E%D1%81%D0%BD%D0%BE%D0%B2%D0%BD%D1%8B%D0%B5-%D0%B1%D0%BB%D1%8E%D0%B4%D0%B0" title="Основные блюда">
								<img style="width:208px;height:115px;" src="./Бесплатный шаблон сайта ресторана_files/208f6757-3ef8-42b7-9249-fdb9bd5c82a0.jpg" alt="Основные блюда" title="Основные блюда">
								</a>
							</div>
							
							<div class="blog-preview">
							    
								<p class="blog-title"><a href="http://restaurant1.sites.xn--80aagbla3am5aqmo9n.xn--p1ai/%D0%9C%D0%B5%D0%BD%D1%8E/%D0%9E%D1%81%D0%BD%D0%BE%D0%B2%D0%BD%D1%8B%D0%B5-%D0%B1%D0%BB%D1%8E%D0%B4%D0%B0">Основные блюда</a></p>
								<p class="blog-text">
								     
 
 Используя в своей работе самые передовые  методы и технологии, компания «Ресторан Пальмира» оказывает целый ряд  услуг, помогая развитию вашего бизнеса. 
 Стремитесь к дальнейшему росту? Ищите новые рынки сбыта? Хотите более оптимально...
								  <a class="more more-items" href="http://restaurant1.sites.xn--80aagbla3am5aqmo9n.xn--p1ai/%D0%9C%D0%B5%D0%BD%D1%8E/%D0%9E%D1%81%D0%BD%D0%BE%D0%B2%D0%BD%D1%8B%D0%B5-%D0%B1%D0%BB%D1%8E%D0%B4%D0%B0">подробнее »</a>
								</p>
								
								
								
								
								
							</div>
							
						</div>
						</div>
						
						
						
						
					    
					    
					    
					    <div class="basic-other-products-item  adv-other-products-item-286327857">
					    
					    
						<div style="margin-bottom:0px;min-height:135px;">
							<div style="margin: 0px 20px 10px 0px;float:left;">
								<a class="mphoto box" style="width:208px;height:115px;" href="http://restaurant1.sites.xn--80aagbla3am5aqmo9n.xn--p1ai/%D0%9C%D0%B5%D0%BD%D1%8E/%D0%97%D0%B0%D0%BA%D1%83%D1%81%D0%BA%D0%B8" title="Закуски">
								<img style="width:208px;height:115px;" src="./Бесплатный шаблон сайта ресторана_files/1135d2a4-ed6c-4a78-a9ac-899713a7a39f.jpg" alt="Закуски" title="Закуски">
								</a>
							</div>
							
							<div class="blog-preview">
							    
								<p class="blog-title"><a href="http://restaurant1.sites.xn--80aagbla3am5aqmo9n.xn--p1ai/%D0%9C%D0%B5%D0%BD%D1%8E/%D0%97%D0%B0%D0%BA%D1%83%D1%81%D0%BA%D0%B8">Закуски</a></p>
								<p class="blog-text">
								     
 
 Используя в своей работе самые передовые  методы и технологии, компания «Ресторан Пальмира» оказывает целый ряд  услуг, помогая развитию вашего бизнеса. 
 Стремитесь к дальнейшему росту? Ищите новые рынки сбыта? Хотите более оптимально...
								  <a class="more more-items" href="http://restaurant1.sites.xn--80aagbla3am5aqmo9n.xn--p1ai/%D0%9C%D0%B5%D0%BD%D1%8E/%D0%97%D0%B0%D0%BA%D1%83%D1%81%D0%BA%D0%B8">подробнее »</a>
								</p>
								
								
								
								
								
							</div>
							
						</div>
						</div>
						
						
						
						
					    
					    
					    
					    <div class="basic-other-products-item  adv-other-products-item-286327857">
					    
					    
						<div style="margin-bottom:0px;min-height:135px;">
							<div style="margin: 0px 20px 10px 0px;float:left;">
								<a class="mphoto box" style="width:208px;height:115px;" href="http://restaurant1.sites.xn--80aagbla3am5aqmo9n.xn--p1ai/%D0%9C%D0%B5%D0%BD%D1%8E/%D0%94%D0%B5%D1%81%D0%B5%D1%80%D1%82%D1%8B" title="Десерты">
								<img style="width:208px;height:115px;" src="./Бесплатный шаблон сайта ресторана_files/b487edda-5511-43ff-937e-c365468eb912.jpg" alt="Десерты" title="Десерты">
								</a>
							</div>
							
							<div class="blog-preview">
							    
								<p class="blog-title"><a href="http://restaurant1.sites.xn--80aagbla3am5aqmo9n.xn--p1ai/%D0%9C%D0%B5%D0%BD%D1%8E/%D0%94%D0%B5%D1%81%D0%B5%D1%80%D1%82%D1%8B">Десерты</a></p>
								<p class="blog-text">
								     
 
 Используя в своей работе самые передовые  методы и технологии, компания «Ресторан Пальмира» оказывает целый ряд  услуг, помогая развитию вашего бизнеса. 
 Стремитесь к дальнейшему росту? Ищите новые рынки сбыта? Хотите более оптимально...
								  <a class="more more-items" href="http://restaurant1.sites.xn--80aagbla3am5aqmo9n.xn--p1ai/%D0%9C%D0%B5%D0%BD%D1%8E/%D0%94%D0%B5%D1%81%D0%B5%D1%80%D1%82%D1%8B">подробнее »</a>
								</p>
								
								
								
								
								
							</div>
							
						</div>
						</div>
						
						
						
						
			</div>
		</div>
</div>
	</td>
</tr>
</tbody></table>
	        	
	    </div>
    	
	    
<div id="footer">
<div class="footer">
    <center><a href="http://restaurant1.sites.xn--80aagbla3am5aqmo9n.xn--p1ai/about">О нас</a> &nbsp;•&nbsp; <a href="http://restaurant1.sites.xn--80aagbla3am5aqmo9n.xn--p1ai/contacts">Контакты</a> &nbsp;&nbsp;&nbsp;© 2012 «Ресторан Пальмира» - Все права защищены. <a href="http://www.ascont.ru/" title="Конструктор сайтов Асконт" style="text-decoration:none" target="_blank">Конструктор сайтов <strong style="text-decoration:underline">Асконт</strong></a></center>
			

</div>
</div>


	</div>
    </div>
</div>



<script type="text/javascript">
    initPage(false, 10, 'trl', 0); 
    initCorners(false, 15, false, 7);
    Shadowbox.init({overlayOpacity: 0.8});
    
    setOpacity('main_area', 1.0);
    
</script>



    

</body></html>