function reply(body, response) {
    var replyData = {
        type: "raw",
        body: body
    };    
    log('replyData\n')
    log(replyData)
    response.replies = response.replies || [];
    response.replies.push(replyData);
}


function addAction(action, context, emotion_type) {
    var command = {
        type: "smart_app_data",
        action: action
    };
    var emotion = {
        emotionId: emotion_type
    };

    for (var index = 0; context.response.replies && index < context.response.replies.length; index ++) {
        if (context.response.replies[index].type === "raw" &&
            context.response.replies[index].body &&
            context.response.replies[index].body.items
        ) {
            context.response.replies[index].body.items.push({command: command});
            context.response.replies[index].body.push(emotion: emotion);
            return;
        }
    }
    
    return reply({emotion: emotion, items: [{command: command}]}, context.response);
}


function addSuggestions(suggestions, context) {
    var buttons = [];
    
    suggestions.forEach(function(suggest) {
        buttons.push(
            {
                action: {
                    text: suggest,
                    type: "text"
                },
                title: suggest
            }
        );
    });
    
    reply({"suggestions": {"buttons": buttons}}, context.response);
}