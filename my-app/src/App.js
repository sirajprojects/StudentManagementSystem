import "./App.css";
// importing components from react-router-dom package

import "./SMS/Admin/css/main.css";
import "./SMS/Admin/css/select2.min.css";
import "./SMS/Admin/css/datepicker.min.css";
import "./SMS/Admin/css/animate.min.css";
import "./SMS/Admin/css/bootstrap.min.css";
import "./SMS/Admin/css/normalize.css";
import "./SMS/Admin/css/style.css";

import "bootstrap/dist/css/bootstrap.min.css";
import { Container, Dropdown } from "react-bootstrap";

import AllClass from "./SMS/Admin/js/AllClass";
import AddClass from "./SMS/Admin/js/AddClass";

import ReactDOM from "react-dom/client";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import TeacherDetails from "./SMS/Admin/js/TeacherDetails";
import AddParent from "./SMS/Admin/js/AddParent";
import AddTeacher from "./SMS/Admin/js/AddTeacher";
import AllParents from "./SMS/Admin/js/AllParents";
import AllStudent from "./SMS/Admin/js/AllStudent";
import AllSubject from "./SMS/Admin/js/AllSubject";
import AllTeacher from "./SMS/Admin/js/AllTeacher";
import ClassRoutine from "./SMS/Admin/js/ClassRoutine";
import ExamGrade from "./SMS/Admin/js/ExamGrade";
import ParentsDetails from "./SMS/Admin/js/ParentsDetails";
import StudentAttendance from "./SMS/Admin/js/StudentAttendance";
import StudentDetails from "./SMS/Admin/js/StudentDetails";
import AccountSettings from "./SMS/Admin/js/AccountSettings";
import UpdateTeacherProfile from "./SMS/Admin/js/UpdateTeacherProfile";
import "../node_modules/bootstrap/dist/js/bootstrap.bundle";
import "../node_modules/bootstrap/dist/js/bootstrap";
import "../node_modules/bootstrap/dist/js/bootstrap.esm";
import "../node_modules/bootstrap/js/dist/dropdown";
import AdmitForm from "./SMS/Admin/js/AdmitForm";
import StudentProfileUpdate from "./SMS/Admin/js/StudentProfileUpdate";
import React, { Component } from "react";

import "bootstrap/dist/css/bootstrap.min.css";
import "./App.css";
import Smslogin from "./SMS/Login/login";
import Index from "./SMS/Admin/js/Index";
import StudentIndex from "./SMS/Student/StudentIndex";
import StudentStudentAttendance from "./SMS/Student/StudentStudentAttendance";
import StudentStudentDetails from "./SMS/Student/StudentStudentDetails";
import TeacherClassRoutine from "./SMS/Teacher/TeacherClassRoutine";
import TeacherIndex from "./SMS/Teacher/TeacherIndex";
import TeacherStudentAttendance from "./SMS/Teacher/TeacherStudentAttendance";
import TeacherTeacherDetails from "./SMS/Teacher/TeacherTeacherDetails";
import TeacherAllStudent from "./SMS/Teacher/TeacherAllStudent";




export default function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route index element={<Smslogin />} />
        <Route path="Index.html" element={<Index />} />
        <Route path="account-settings.html" element={<AccountSettings />} />
        <Route path="add-class" element={<AddClass />} />

        <Route path="add-parents.html" element={<AddParent />} />
        <Route path="add-teacher.html" element={<AddTeacher />} />

        <Route path="admit-form.html" element={<AdmitForm />} />
        <Route path="all-class.html" element={<AllClass />} />

        <Route path="all-parents.html" element={<AllParents />} />
        <Route path="all-student.html" element={<AllStudent />} />

        <Route path="all-subject.html" element={<AllSubject />} />
        <Route path="all-teacher.html" element={<AllTeacher />} />
        <Route path="class-routine.html" element={<ClassRoutine />} />
        <Route path="exam-grade.html" element={<ExamGrade />} />
        <Route path="exam-schedule.html" element={<examSchedule />} />
        <Route path="parents-details.html" element={<ParentsDetails />} />
        <Route path="student-attendence.html" element={<StudentAttendance />} />
        <Route path="student-details.html" element={<StudentDetails />} />
        <Route path="teacher-details.html" element={<TeacherDetails />} />
        <Route path="update-profile.html" element={<UpdateTeacherProfile />} />
        <Route path="student-profile-update.html" element={<StudentProfileUpdate />} />


        <Route path="student-index" element={<StudentIndex />} />
        <Route path="student-student-attendance" element={<StudentStudentAttendance />} />
        <Route path="student-student-details" element={<StudentStudentDetails />} />

        <Route path="teacher-class-routine" element={<TeacherClassRoutine />} />
        <Route path="teacher-index" element={<TeacherIndex />} />
        <Route path="teacher-student-attendance" element={<TeacherStudentAttendance />} />
        <Route path="teacher-teacher-details" element={<TeacherTeacherDetails />} />
        <Route path="teacher-all-student" element={<TeacherAllStudent />} />



      </Routes>
    </BrowserRouter>
  );
}

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(<App />);
