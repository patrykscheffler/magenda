angular.module('MeetingsAgenda').controller('EventsEditController', function(Event, $scope, $routeParams, $location) {
    $scope.event = Event.get({id: $routeParams.id}, function() {
        $scope.event.eventtime = $scope.event.eventtime.slice(0, $scope.event.eventtime.length - 3);
    });
    $scope.isSubmitting = false;

    $scope.saveEvent = function(event) {
        $scope.isSubmitting = true;
        $scope.event.eventtime += ":00";
        $scope.event.$update().finally(function() {
            $scope.isSubmitting = false;
            $location.path('/events/' + event.id);
        });
    };
});
