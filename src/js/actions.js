function addNote(note, context) {
    addAction({
        type: "add_note",
        note: note,
        emotion_type: "udovolstvie"
    }, context);
}

function doneNote(id, context){
    addAction({
        type: "done_note",
        id: id,
        emotion_type: "udovolstvie"
    }, context);
}

function deleteNote(id, context){
    addAction({
        type: "delete_note",
        id: id,
        emotion_type: "udovolstvie"
    }, context);
}
