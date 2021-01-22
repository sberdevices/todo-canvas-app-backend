theme: /

    state: ДобавлениеЭлемента
        q!: (~добавить|~установить|добавь|запиши|поставь|закинь|~напомнить) 
            [~напоминание|~заметка|~задание|~задача]
            $AnyText::anyText
            
        script:
            log($request)
            log("request.RawRequest")
            log($request.RawRequest)

            addNote($parseTree._anyText, $context);
        
        go!: /ДобавленаНоваяЗапись
