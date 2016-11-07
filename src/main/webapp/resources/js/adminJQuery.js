$(document).ready(function(){
    $("button[id*='addDishIn']").click(function(){
        var menuName = this.id.substring(9, this.id.length);
        var selectFromAdd = "#dishListForAddIn" + menuName;
        var condition = selectFromAdd + " option:selected";
        var selectForAdd = "#dishList" + menuName;
        $(condition).each(function() {
            var check = "yes";
            var dishName = this.text;
            $(selectForAdd + " option").each(function(){
                if(this.text == dishName) check = "no";
            });
            if (check == "yes") {
               $(selectForAdd).append("<option>" + this.text + "</option>");
               this.remove();
            }
        });
    });
});
$(document).ready(function(){
    $("button[id*='delDishIn']").click(function(){
        var menuName = this.id.substring(9, this.id.length);
        var selectFromAdd = "#dishListForAddIn" + menuName;
        var selectForAdd = "#dishList" + menuName;
        var condition = selectForAdd + " option:selected";
        $(condition).each(function() {
            var check = "yes";
            var dishName = this.text;
            $(selectFromAdd + " option").each(function(){
                if(this.text == dishName) check = "no";
            });
            if (check == "yes") {
               $(selectFromAdd).append("<option>" + this.text + "</option>");
            }
            this.remove();
        });
    });
});

$("form").submit(function(){
    $("select option").each(function() {
        $(this).attr("selected","selected");
    });
});