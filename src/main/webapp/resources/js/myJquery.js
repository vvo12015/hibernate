$(document).ready(function(){
	$.getJSON('listMenu', {}, function(listMenu){
	    for(var i=0;i < listMenu.length;i++){
	        var li = '<li>';
	        li += '<a href="#' + listMenu[i].name + '">' + listMenu[i].name + '</a>';
	        li += '</li>';
            $('#list-menu').append(li);
	    }


	    for(var i=0;i < listMenu.length;i++){
	        var nameDiv = listMenu[i].name;
	        var div = '<div id="' + nameDiv + '"></div>';
            $('#right-col').append(div);
            $.each(listMenu[i].dishes, function(i, dish){
	            var div = '<div class="thumbnail">';
                div += '<img src="http://localhost:8080/restaurant/resources/img/' + dish.photo + '.jpg" alt="' + dish.name + '">';
                div += '<div class="caption">';
                div += '<h3>' + dish.name + '</h3>';
                div += '<p>' + 'Вага - ' + dish.weight + '</p>';
                div += '<p>' + 'Ціна - ' + dish.price + '$</p></div>';
                div += '</div>';
                $('#' + nameDiv).append(div);
            });
        }
	});
});

$(document).ready(function(){
    $.getJSON('listMenu', {}, function(listMenu){
        $('.nav-sidebar li:first').addClass('active');
        $('.main>div').hide().filter(':first').show();
        $('.nav-sidebar a').click(function(){                         // При клике на вкладку
            $('.main>div').hide().filter(this.hash).show();   // - показывается блок с описанием текущей вкладки
            $('.nav-sidebar li').removeClass('active');                 // - удаляется класс 'select' у активной ранее вкладки
            $(this).parent().addClass('active');                    // - добавляется класс 'select' для выбранной вкладки
            return (false);                                         // - прерывается обработка события onClick
        })
    });
});

