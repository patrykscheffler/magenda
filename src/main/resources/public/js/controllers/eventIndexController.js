angular.module('MeetingsAgenda').controller('EventsIndexController', function($scope, $location, Event) {
    $scope.events = Event.query();

    $scope.deleteEvent = function(event) {
        event.$remove().then(function() {
            $location.path('/events');
        });
    };

    $scope.sortEvent = function(event) {
        var date = new Date(event.eventdate);
        return date;
    };
});