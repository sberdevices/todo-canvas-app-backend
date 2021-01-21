# Когда приходит ServerAction, сообщение прилетает в состояние, 
# с условием на вход action_id.
# пример:
#     event!: action_id

theme: /
    
    state: ЗаданиеВыполнено
        event!: done
        event!: DONE
        #'request data\n' + 
        script:
            log($request)
            
        if: $request.data.eventData.note
            a: Закрыл {{ $request.data.eventData.note }}! Молодец!
        else:
            random: 
                a: Молодец!
                a: Красавчик!
                a: Супер
                
        buttons:
            "Запиши купить молоко"
            "Добавь запись помыть машину"

           
    state: ДобавленаНоваяЗапись
        event!: note_added
        event!: NOTE_ADDED

        random: 
            a: Добавлено!
            a: Сохранено!
            a: Записано!
        
        buttons:
            "Запиши купить молоко"
            "Добавь запись помыть машину" 
            