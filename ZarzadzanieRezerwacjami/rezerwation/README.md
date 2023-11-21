Rozszerzanie interfejsów repozytorium o interfejsy z Spring Data JPA,
takie jak JpaRepository, dostarcza gotowych implementacji ogólnych operacji bazodanowych.
Oto kilka korzyści z korzystania z JpaRepository:

Operacje CRUD (Create, Read, Update, Delete): 
JpaRepository dostarcza gotowe metody do wykonywania podstawowych operacji CRUD na encjach,
takich jak save, findById, findAll, delete, itp. Nie musisz implementować tych operacji ręcznie;
są one dostępne out-of-the-box.

Zapytania niestandardowe:
Możesz definiować niestandardowe zapytania bazodanowe, korzystając z konwencji nazw metod w interfejsie repozytorium.
Na przykład, jeśli masz pole firstName w encji User, możesz utworzyć metodę o nazwie findByFirstName,
a Spring Data JPA automatycznie utworzy zapytanie na podstawie tej metody.

Paginacja i Sortowanie:
JpaRepository obsługuje automatycznie paginację i sortowanie wyników zapytań.
Możesz użyć metod takich jak findAll(Pageable pageable) lub findAll(Sort sort),
aby uzyskać wyniki w określonej kolejności lub podzielić na strony.

Obsługa Zdarzeń:
Spring Data JPA zapewnia obsługę zdarzeń przed i po operacjach bazodanowych.
Na przykład, możesz zaimplementować metody oznaczone adnotacją @PrePersist, @PostPersist, itp., 
aby wykonywać dodatkowe akcje przed lub po operacjach CRUD.

Specyfikacje (Specifications):
Możesz definiować specyfikacje (predykaty) za pomocą interfejsu Specification
i korzystać z nich w metodach repozytorium do dynamicznego definiowania zapytań bazodanowych.

Korzystanie z JpaRepository pozwala skupić się na logice biznesowej aplikacji,
a nie na szczegółach implementacyjnych dostępu do bazy danych.
Oferuje to bardziej zwięzłe i zrozumiałe repozytoria, 
a także ułatwia testowanie dzięki dostępności gotowych operacji CRUD.
