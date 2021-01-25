theme: /

    state: ДобавлениеЭлемента
        q!: (~добавить|~установить|добавь|запиши|поставь|закинь|~напомнить) 
            [~напоминание|~заметка|~задание|~задача|~запись]
            $AnyText::anyText
            
        script:
            log("RawRequest add")
            log($request.rawRequest)

            addNote($parseTree._anyText, $context);
        
        go!: /ДобавленаНоваяЗапись
