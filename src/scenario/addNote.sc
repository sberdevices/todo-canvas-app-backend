theme: /

    state: ДобавлениеЭлемента
        q!: (~добавить|~установить|добавь|запиши|поставь|закинь|~напомнить) 
            [~напоминание|~заметка|~задание|~задача]
            $AnyText::anyText
            
        script:
            log("RawRequest add_element")
            log($request.rawRequest)
            log("RawRequest.payload add_element")
            log($request.rawRequest.payload)
            addNote($parseTree._anyText, $context);
        
        go!: /ДобавленаНоваяЗапись
