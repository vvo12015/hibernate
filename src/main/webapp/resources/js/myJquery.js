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
	            div += '<a href="dish?id=' + dish.id + '">';
                div += '<img src="http://localhost:8080/restaurant/resources/img/' + dish.photo + '.jpg" alt="' + dish.name + '">';
                div += '</a>';
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
        $('.nav-sidebar a').click(function(){
            $('.main>div').hide().filter(this.hash).show();
            $('.nav-sidebar li').removeClass('active');
            $(this).parent().addClass('active');
            return (false);
        })
    });
});

$(document).ready(function(){
    $.getJSON('employees', {}, function(employeeList){
        var divForPadding = '<div class="col-md-3"></div>';
        for(var i=0;i < employeeList.length;i++){
            var nameDiv = employeeList[i].name;
            var row = '<div class="row">';
                row += divForPadding;
                row += '<div id="' + nameDiv + '" class="col-md-6 employee-list">';
                    row += '<div class="thumbnail">';
                        row += '<img scr="localhost:8080/restaurant/' + employeeList[i].surName + '" alt="'
                                + employeeList[i].surName + '">';
                        row += '<div class="caption">';
                            row += '<h3>' + employeeList[i].name + '</h3>';
                        row += '</div>';
                    row += '</div>';
                row += '</div>';
                row += divForPadding;
            row += "</div>";
            $('#employee-list').append(row);
        }
    });
});

