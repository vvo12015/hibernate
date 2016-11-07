$(document).ready(function(){
    $("button[id*='add']").click(function(){
        var elementManage = elementName(this.id);
        var selectFromAdd = "#listForAddIn_" + elementManage;
        var condition = selectFromAdd + " option:selected";
        var selectForAdd = "#list_" + elementManage;
        var conditions = createConditions(this.id);
        $(conditions.InSelected).each(function() {
            var check = "yes";
            var elementList = this.text;
            $(selectForAdd + " option").each(function(){
                if(this.text == elementList) check = "no";
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
        var nameElements = this.id.split("_");
        var countElements = nameElements.length;
        var menuName = this.id.split("_")[countElements-1];
        var selectFromAdd = "#listForAddIn_" + menuName;
        var selectForAdd = "#list_" + menuName;
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

$(document).ready(function(){
    var buttonName = 'saveMenu';
    $("[id*='"+ buttonName + "']").click(function(){
        var menuName = this.id.substring(buttonName.length, this.id.length);
        var selectForAdd = "#list_" + menuName;
        var conditionSelectedOff = selectForAdd + " option";
        var conditionSelectedOn = selectForAdd + " :selected";
        $("#Enter").text(conditionSelectedOn);
        $(conditionSelectedOn).prop("selected", false);
        $(conditionSelectedOff).prop("selected","selected");
    });
});

function elementName(text){
    var nameElements = text.split("_");
    var countElements = nameElements.length;
    var result = text.split("_")[countElements-1];

    return result;
}
function createConditions(text){
    var selectForAdd = "#list_" + elementManage;
    var selectFromAdd = "#listForAddIn_" + elementManage(text);
    var result = {
        conditionIn          :selectForAdd  + "  option",
        conditionInSelected  :selectForAdd  + " :selected",
        conditionFrom        :selectFromAdd + "  option",
        conditionFromSelected:selectFromAdd + " :selected"
    };
    return result;
}