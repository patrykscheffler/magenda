angular.module('MeetingsAgenda').config(function($routeProvider) {
    $routeProvider
        .when('/', {
            redirectTo: '/events'
        })
        .when('/events', {
            templateUrl: 'views/home.html',
            controller: 'EventsIndexController'
        })
        .when('/events/new', {
            templateUrl: 'views/events/new.html',
            controller: 'EventsCreateController'
        })
        .when('/events/:id', {
            templateUrl: 'views/events/show.html',
            controller: 'EventsShowController'
        })
        .when('/events/:id/edit', {
            templateUrl: 'views/events/edit.html',
            controller: 'EventsEditController'
        });
});
