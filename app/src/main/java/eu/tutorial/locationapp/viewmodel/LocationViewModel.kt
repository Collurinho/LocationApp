package eu.tutorial.locationapp.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import eu.tutorial.locationapp.model.LocationData

class LocationViewModel: ViewModel() {
    private val _location = mutableStateOf<LocationData?>(null)
    val location: State<LocationData?> = _location

    fun updateLocation(newLocation: LocationData) {
        _location.value = newLocation
    }
}