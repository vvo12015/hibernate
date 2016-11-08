$(document).ready(function(){
    $("button[id*='add']").click(function(){
        var conditions = createConditions(this.id);
        $(conditions.listFromOn).each(function() {
            var check = "yes";
            var elementList = this.text;
            $(conditions.listInAll).each(function(){
                if(this.text == elementList) check = "no";
            });
            if (check == "yes") {
               $(conditions.listIn).append("<option>" + this.text + "</option>");
               this.remove();
            }
        });
    });
});
$(document).ready(function(){
    $("button[id*='del']").click(function(){
        var conditions = createConditions(this.id);
        $(conditions.listInOn).each(function() {
            var check = "yes";
            var name = this.text;
            $(conditions.listFromAll).each(function(){
                if(this.text == name) check = "no";
            });
            if (check == "yes") {
               $(conditions.listFrom).append("<option>" + this.text + "</option>");
            }
            this.remove();
        });
    });
});
function elementName(text){
    var nameElements = text.split("_");
    var countElements = nameElements.length;
    var result = text.split("_")[countElements-1];

    return result;
}
function createConditions(text){
    var selectForAdd = "#list_" + elementName(text);
    var selectFromAdd = "#listForAddIn_" + elementName(text);
    var result = {
        listIn     :selectForAdd,
        listFrom   :selectFromAdd,
        listInAll  :selectForAdd  + "  option",
        listInOn   :selectForAdd  + " option:selected",
        listFromAll:selectFromAdd + "  option",
        listFromOn :selectFromAdd + " option:selected"
    };
    return result;
}

$(document).ready(function(){
    var buttonName = 'saveMenu';
    $("[id*='"+ buttonName + "']").click(function(){
        var conditions = createConditions(this.id);
        $(conditions.listInOn).prop("selected", false);
        $(conditions.listInAll).prop("selected","selected");
    });
});
