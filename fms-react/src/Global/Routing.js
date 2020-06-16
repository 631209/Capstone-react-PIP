
import React, { Component } from 'react';
import { Switch, Route, Redirect } from 'react-router-dom';
import Question from '../Feedback/Question';
import AddQuestion from '../Feedback/AddQuestion';
import EditQuestion from '../Feedback/EditQuestion';
import ThanksScreen from '../Feedback/ThanksScreen';
import Login from '../Login/Login';
import Dashboard from '../Events/Dashboard';
import Events from '../Events/Events';
import EventDetail from '../Events/EventDetail';
import Roles from '../Events/Roles';
import Reports from '../Events/Reports';
import NotParticipated from '../Feedback/NotParticipated';
import Participated from '../Feedback/Participated';
import UnRegistered from '../Feedback/UnRegistered';

const PrivateRoute = ({ component: Component, ...rest }) => (
    <Route {...rest} render={props => {
        const currentUser = localStorage.getItem('currentUser');
        console.log(currentUser);
        if (!currentUser) {
            // not logged in so redirect to login page with the return url
            return <Redirect to={{ pathname: '/', state: { from: props.location } }} />
        }
 
        return <Component {...props} />
    }} />
)
const Routing = props=>{
return (
<div>
    <Switch>
        <Route exact path='/' component={Login}/>
        <PrivateRoute  path='/dashboard' component={Dashboard}/>
        <PrivateRoute  path='/events' component={Events}/>
        <PrivateRoute  path='/eventdetail' component={EventDetail}/>
        <PrivateRoute  path='/reports' component={Reports}/>
        <PrivateRoute  path='/roles' component={Roles}/>
        <PrivateRoute  path='/questioninfo' component={Question}/>
        <PrivateRoute path='/addquestion' component={AddQuestion} />
        <PrivateRoute path='/editquestion' component={EditQuestion} />
        <Route path='/thanksscreen' component={ThanksScreen} />
        <Route path='/participated' component={Participated} />
        <Route path='/notparticipated' component={NotParticipated} />
        <Route path='/unregistered' component={UnRegistered} />

    </Switch>
    </div>
    )
}

export default Routing;