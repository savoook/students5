function modifyDiscipline() {
    var checkboxes = $('input[type=checkbox]:checked');
    if (checkboxes.length == 0) {
        alert("Выберите дисциплину")

        return;
    }
    if (checkboxes.length > 1) {
        alert("Выберите njkmrj 1 lbcw дисциплину")

        return;
    }
    var idDisc = checkboxes[0].val();
    $("#idModifDisc").val(idDisc);
    $("#modifDiscForm").submit();
}