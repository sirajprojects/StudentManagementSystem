import "./App.css";
// importing components from react-router-dom package

import './SMS/Admin/main.css';
import './SMS/Admin/select2.min.css';
import './SMS/Admin/datepicker.min.css';
import './SMS/Admin/animate.min.css';
import './SMS/Admin/bootstrap.min.css';
import './SMS/Admin/normalize.css';
import './SMS/Admin/style.css';

import AllClass from "./SMS/Admin/AllClass";
import AddClass from "./SMS/Admin/AddClass";

import ReactDOM from "react-dom/client";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import TeacherDetails from "./SMS/Admin/TeacherDetails";
import AddParent from "./SMS/Admin/AddParent";
import AddTeacher from "./SMS/Admin/AddTeacher";
import AllParents from "./SMS/Admin/AllParents";
import AllStudent from "./SMS/Admin/AllStudent";
import AllSubject from "./SMS/Admin/AllSubject";
import AllTeacher from "./SMS/Admin/AllTeacher";
import ClassRoutine from "./SMS/Admin/ClassRoutine";
import ExamGrade from "./SMS/Admin/ExamGrade";
import ParentsDetails from "./SMS/Admin/ParentsDetails";
import StudentAttendance from "./SMS/Admin/StudentAttendance";
import StudentDetails from "./SMS/Admin/StudentDetails";
import AccountSettings from "./SMS/Admin/AccountSettings";


export default function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route index element={<AllClass />} />
        <Route path="account-settings.html" element={<AccountSettings />} />
        <Route path="add-class" element={<AddClass />} />

        <Route path="add-parents.html" element={<AddParent />} />
        <Route path="add-teacher.html" element={<AddTeacher />} />

        <Route path="admit-form.html" element={<AddClass />} />
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
      </Routes>
    </BrowserRouter>
  );
}

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(<App />);

