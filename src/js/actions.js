// "udovolstvie" - id эмоции
function addNote(note, context) {
    addAction({
        type: "add_note",
        note: note,
    }, context, "udovolstvie");
}

function doneNote(id, context){
    addAction({
        type: "done_note",
        id: id
    }, context, "udovolstvie");
}

function deleteNote(id, context){
    addAction({
        type: "delete_note",
        id: id 
    }, context, "udovolstvie");
}
