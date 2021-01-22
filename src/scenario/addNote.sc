theme: /

    state: ДобавлениеЭлемента
        q!: (~добавить|~установить|добавь|запиши|поставь|закинь|~напомнить) 
            [~напоминание|~заметка|~задание|~задача]
            $AnyText::anyText
            
        script:
            log("RawRequest begin")
            log($request.rawRequest)
            log("RawRequest.payload begin")
            log($request.rawRequest.payload)
            addNote($parseTree._anyText, $context);
        
        go!: /ДобавленаНоваяЗапись
