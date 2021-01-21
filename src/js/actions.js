function addNote(note, context) {
    addAction({
        type: "add_note",
        note: note,
        emotion: "udovolstvie"
    }, context);
}

function doneNote(id, context){
    addAction({
        type: "done_note",
        id: id,
        emotion: "udovolstvie"
    }, context);
}

function deleteNote(id, context){
    addAction({
        type: "delete_note",
        id: id,
        emotion: "udovolstvie"
    }, context);
}
