function modifyDiscipline() {
    var checkboxes = $('input[type=checkbox]:checked');
    if (checkboxes.length == 0) {
        alert("Выберите дисциплину");
        return;
    }
    if (checkboxes.length > 1) {
        alert("Выберите только одну дисциплину");
        return;
    }
    var idDisc = checkboxes[0].value();
    $("#idModifDisc").val(idDisc);
    $("#modifDiscForm").submit();
}

function deleteDiscipline() {
    var checkboxes = $('input[type=checkbox]:checked');
    if (checkboxes.length == 0) {
        alert("Выберите дисциплину");
        return;
    }
    var ids="";
    for (var i=0; i<checkboxes.length;i++){
        ids=ids+checkboxes[i].value+","
    }

    $("#idDeleteDisc").val(ids);
    $("#idDeleteForm").submit();
}