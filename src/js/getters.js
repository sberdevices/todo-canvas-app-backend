function getRequest(context) {
    if (context && context.request) {
        return context.request.rawRequest;
    }
    return {};
}

function getSelectedItem(request) {
    if (request &&
        request.payload &&
        request.payload.meta &&
        request.payload.meta.current_app &&
        request.payload.meta.current_app.state
    ) {
        return request.payload.selected_item;
    }
    return null;
}

function getItems(request) {
    if (request &&
        request.payload &&
        request.payload.meta &&
        request.payload.meta.current_app &&
        request.payload.meta.current_app.state &&
        request.payload.meta.current_app.state.item_selector
    ) {
        return request.payload.meta.current_app.state.item_selector.items;
    }
    return null;
}
