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
    var idDisc = checkboxes[0].value;
    $("#idModifDisc").val(idDisc);
    $("#modifDiscForm").submit();
}

function deleteDiscipline() {
    var checkboxes = $('input[type=checkbox]:checked');
    if (checkboxes.length == 0) {
        alert("Выберите дисциплину");
        return;
    }
    var ids = "";
    for (var i = 0; i < checkboxes.length; i++) {
        ids = ids + checkboxes[i].value + ",";
    }

    $("#idsDeleteDisc").val(ids);
    $("#idsDeleteForm").submit();
}

function modifyStudent() {
    var checkboxes = $('input[type=checkbox]:checked');
    if (checkboxes.length == 0) {
        alert("Выберете хотя бы одного студента");
        return;
    }
    if (checkboxes.length > 1) {
        alert("Выберете только одного студента");
        return;
    }
    var idSt = checkboxes[0].value;
    $("#iDmodifSt").val(idSt);
    $("#studentsModifyForm").submit();
}

function deleteStudent() {
    var checkboxes = $('input[type=checkbox]:checked');
    if (checkboxes.length == 0) {
        alert("Выберете хотя бы одного или нескольких студентов");
        return;
    }
    var ids = "";
    for (var i = 0; i < checkboxes.length; i++) {
        ids = ids + checkboxes[i].value + ",";
    }
    $("#idsDeleteStudents").val(ids);
    $("#studentsDeleteForm").submit();
}
function studentProgress() {
    var checkboxes = $('input[type=checkbox]:checked');
    if (checkboxes.length == 0) {
        alert("Выберите студента");
        return;
    }
    if (checkboxes.length > 1) {
        alert("Выберите только одного студента");
        return;
    }
    var idSt = checkboxes[0].value;
    $("#idSt").val(idSt);
    $("#ProgStForm").submit();
}