angular.module('MeetingsAgenda').factory('Event', function($resource) {
    return $resource('/api/events/:id', {id: '@id'}, {
        update: {
            method: 'PUT'
        }
    });
});