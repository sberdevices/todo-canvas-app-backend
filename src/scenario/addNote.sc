theme: /

    state: ДобавлениеЭлемента
        q!: (~добавить|~установить|добавь|запиши|поставь|закинь|~напомнить) 
            [~напоминание|~заметка|~задание|~задача]
            $AnyText::anyText
            
        script:
            log("rawRequest add");
            log($request);

            addNote($parseTree._anyText, $context);
        
        go!: /ДобавленаНоваяЗапись
